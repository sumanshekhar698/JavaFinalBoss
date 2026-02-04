package dev.codecounty.new_featuress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherApp {
    public static void main(String[] args) {
        // 1. Define the API endpoint (London coordinates)
        String url = "https://api.open-meteo.com/v1/forecast?latitude=51.5074&longitude=-0.1278&current_weather=true";

        // 2. Create the Client
        var client = HttpClient.newHttpClient();

        // 3. Build the Request
        var request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                .GET()
                .build();

        // 4. Send the request and handle the response
        try {
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                System.out.println("--- Weather Data Successfully Fetched ---");
                System.out.println(response.body());
            } else {
                System.out.println("Error: Received HTTP " + response.statusCode());
            }
        } catch (Exception e) {
            System.err.println("Request failed: " + e.getMessage());
        }
    }


}