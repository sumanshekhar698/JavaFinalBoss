package dev.codecounty.new_featuress;

import java.time.LocalDateTime;

// 1. ENCAPSULATION & ABSTRACTION
// We seal the interface to control the hierarchy. 
// Records abstract away the boilerplate (getters, equals, hashCode).
sealed interface PaymentMethod permits CreditCard, Crypto, Cash {}

record CreditCard(String cardNumber, double limit) implements PaymentMethod {}
record Crypto(String walletAddress, String currency) implements PaymentMethod {}
record Cash(double amount) implements PaymentMethod {}

// 2. INHERITANCE (Flexible Constructor Bodies)
class Transaction {
    private final double amount;

    public Transaction(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        this.amount = amount;
    }
}

class ProcessedTransaction extends Transaction {
    private final String timestamp;

    public ProcessedTransaction(double amount) {
        // NEW JDK FEATURE: Logic BEFORE super()
        // We can do prep work before the parent is even initialized
        super(amount);
        String time = LocalDateTime.now().toString();
        
//        super(amount); // Initialize parent
        this.timestamp = time;
    }
}

// 3. POLYMORPHISM (Pattern Matching & Deconstruction)
public class PaymentProcessor {
    public static void process(PaymentMethod method, double amount) {
        switch (method) {
            // Record Pattern: Deconstructing the object to get 'limit' directly
            case CreditCard(String _, double limit) -> {
                if (amount > limit) System.out.println("Credit limit exceeded!");
                else System.out.println("Charging card ending in ... " );
                // Note: '_' is an unnamed pattern if we don't need the card number
            }

            // Pattern Matching with a 'when' clause (Guards)
            case Crypto(String addr, String type) when type.equals("BTC") -> 
                System.out.println("Processing Bitcoin payment to: " + addr);

            case Cash(_) -> 
                System.out.println("Cash payment received.");
                
            // No default needed! Because the interface is 'sealed', 
            // the compiler knows we covered all possibilities.
            default -> throw new IllegalStateException("Unexpected value: " + method);
        }
    }

    public static void main(String[] args) {
        // Using an unnamed variable for an ignored exception
        try {
            PaymentMethod myCard = new CreditCard("1234-5678", 5000.0);
            process(myCard, 600.0);
        } catch (Exception _) { 
            System.out.println("An error occurred, but we don't need the exception details.");
        }
    }
}