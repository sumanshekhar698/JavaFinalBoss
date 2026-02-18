package dev.codecounty.multithreading.advanced;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;










public class WeatherAsyncCall {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        String lon = "75.703529";
        String lat = "31.251932";

        String url = String.format(
                "https://api.open-meteo.com/v1/forecast?latitude=%s&longitude=%s&current_weather=true",
                lat, lon
        );

        System.out.println(url);

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                    try {
                        getWeather(url);
                    } catch (IOException | InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }, executor)
                .whenComplete((res, ex) -> executor.shutdown());

//        future.join();      // wait for completion
//        executor.shutdown();


        System.out.println("API call triggered (fire-and-forget)...");

        // Prevent main from exiting immediately (for demo only)
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException ignored) {
//        }
    }

    static void getWeather(String url) throws IOException, InterruptedException {
        try (HttpClient client = HttpClient.newHttpClient();
        ) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            System.out.println("Weather API Response:");
            System.out.println(response.statusCode());
            System.out.println(response.body());
        }


    }
}
