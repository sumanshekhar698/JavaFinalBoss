package dev.codecounty.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class NioFileExample {
    public static void main(String[] args) {
        // 1. Define the file path
        Path filePath = Paths.get("student_scores.txt");

        try {
            // 2. Writing to a file
            String content = "Student 1: 90\nStudent 2: 45\nStudent 3: 67";
            Files.writeString(filePath, content);
            System.out.println("File written successfully!");

            // 3. Reading from a file
            // We can read all lines into a List of Strings
            List<String> lines = Files.readAllLines(filePath);
            
            System.out.println("\n--- Reading File Content ---");
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle potential errors (file not found, permission denied, etc.)
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}