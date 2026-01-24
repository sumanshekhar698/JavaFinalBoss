package dev.codecounty.oops.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJoinExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");

        // Simple joining
        String result = fruits.stream()
                              .collect(Collectors.joining(" | "));
        
        System.out.println(result); 
        // Output: Apple | Banana | Orange

        // Complex joining with prefix and suffix
        String styledResult = fruits.stream()
                                    .map(String::toUpperCase) // Bonus: you can transform data!
                                    .collect(Collectors.joining(", ", "FRUITS: {", "}"));
        
        System.out.println(styledResult);
        // Output: FRUITS: {APPLE, BANANA, ORANGE}
    }
}