package dev.codecounty.new_featuress;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

public class ApiExample {
    public static void main(String[] args) throws NoSuchAlgorithmException, KeyManagementException {

        // ... inside your main method ...

// 1.1. Create a trust manager that does not validate certificate chains
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    public void checkClientTrusted(X509Certificate[] certs, String authType) {
                    }

                    public void checkServerTrusted(X509Certificate[] certs, String authType) {
                    }
                }
        };

// 1.2. Install the all-trusting trust manager
        SSLContext sslContext = SSLContext.getInstance("SSL");
        sslContext.init(null, trustAllCerts, new SecureRandom());


        // 1. Create the Client (the engine)
//        HttpClient client = HttpClient.newHttpClient();

        // 1.3. Create the client using this context
        HttpClient client = HttpClient.newBuilder()
                .sslContext(sslContext) // Use the "trust everyone" context
                .build();

        // 2. Build the Request (the message)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://pokeapi.co/api/v2/pokemon/pikachu"))
                .GET() // Default method is GET
                .build();

        try {
            // 3. Send the Request and get the Response
            // BodyHandlers.ofString() tells Java to treat the result as a String
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // 4. Handle the results
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: \n" + response.body());

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}