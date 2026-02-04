package dev.codecounty.new_featuress;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import tools.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherDashboard {
    public static void main(String[] args) {
        String url = "https://api.open-meteo.com/v1/forecast?latitude=51.5074&longitude=-0.1278&current_weather=true";
        
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper(); // Jackson's brain

        try {
            var request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Map JSON String to Java Record
            WeatherResponse data = mapper.readValue(response.body(), WeatherResponse.class);
            CurrentWeather current = data.current();

            // Beautified Output
            System.out.println("====================================");
            System.out.println("   🌍 WEATHER REPORT: LONDON");
            System.out.println("====================================");
            System.out.printf(" 🌡️ Temperature: %.1f°C%n", current.temperature());
            System.out.printf(" 💨 Wind Speed:  %.1f km/h%n", current.windspeed());
            System.out.println(" 🕒 Local Time:  " + current.time());
            System.out.println(" 📝 Condition:   " + getWeatherDesc(current.weathercode()));
            System.out.println("====================================");

        } catch (Exception e) {
            System.out.println(" Error parsing weather data: " + e.getMessage());
        }
    }

    // Helper to turn numeric codes into words
    private static String getWeatherDesc(int code) {
        return switch (code) {
            case 0 -> "Clear Sky ☀️";
            case 1, 2, 3 -> "Partly Cloudy ⛅";
            case 61, 63 -> "Rainy 🌧️";
            default -> "Unknown (" + code + ")";
        };
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record WeatherResponse(
            @JsonProperty("current_weather") CurrentWeather current
    ) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    record CurrentWeather(
            double temperature,
            double windspeed,
            int weathercode,
            String time
    ) {
    }
}