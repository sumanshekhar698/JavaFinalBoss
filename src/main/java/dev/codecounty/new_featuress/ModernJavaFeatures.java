package dev.codecounty.new_featuress;

public class ModernJavaFeatures {

    // 1. Record Pattern (Extraction Abstraction)
    // Records automatically create components for data
    record GoldCard(String name, int points) {}

    public static void checkLoyalty(Object obj) {
        // Instead of: if (obj instanceof GoldCard) { GoldCard g = (GoldCard)obj; ... }
        // We "deconstruct" the object directly in the condition.
        if (obj instanceof GoldCard(String name, int points)) {
            System.out.println("Member: " + name);
            System.out.println("Points: " + points); // Variable 'points' is extracted instantly
        }
    }

    // 2. Unnamed Variables (The '_' underscore)
    public static void validateInput(String input) {
        try {
            int value = Integer.parseInt(input);
            System.out.println("Valid number: " + value);
        } 
        // We use '_' because we don't need the exception object 'e' 
        // to print a simple error message.
        catch (NumberFormatException _) { 
            System.out.println("Error: That wasn't a valid number!");
        }
    }

    public static void main(String[] args) {
        GoldCard member = new GoldCard("Alice", 1500);
        
        checkLoyalty(member);
        validateInput("not_a_number");
    }
}