package dev.codecounty.new_featuress;

import java.util.Optional;


public class OptionalExample {
    public static void main(String[] args) {

        String name = null;
        if (name != null) {
            System.out.println(name.isEmpty());
        }

        Optional<String> optionalName = Optional.ofNullable(name);

        // Check if value exists
        if (optionalName.isPresent()) {
            System.out.println(optionalName.get());
        } else {
            System.out.println("Name is not present");
        }

        // Better way
        optionalName.ifPresent(n -> System.out.println("Name: " + n));

        // Default value if null
        String result = optionalName.orElse("Default Name");
        System.out.println(result);
    }
}
