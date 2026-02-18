package dev.codecounty.multithreading;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class FireAndForgetExample {

    public static void main(String[] args) {

        CompletableFuture.runAsync(() -> {
            callExternalApi();
        });

        System.out.println("Request triggered. Not waiting for API response.");
    }

    private static void callExternalApi() {
        try {
            URL url = new URL("https://api.example.com/notify");
            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            System.out.println("API Response Code: " + responseCode);

        } catch (Exception e) {
            System.out.println("API call failed: " + e.getMessage());
        }
    }
}
