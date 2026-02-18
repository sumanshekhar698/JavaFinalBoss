package dev.codecounty.multithreading.advanced;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class FireAndForgetApiTest {

    public static void main(String[] args) {

        CompletableFuture.runAsync(FireAndForgetApiTest::callPublicApi);

        System.out.println("API call triggered (fire-and-forget).");

        // Prevent JVM from exiting immediately (only for demo)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {
        }
    }

    private static void callPublicApi() {
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                    .GET()
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Response Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());

        } catch (Exception e) {
            System.out.println("API call failed: " + e.getMessage());
        }
    }
}
