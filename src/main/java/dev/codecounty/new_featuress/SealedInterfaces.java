package dev.codecounty.new_featuress;

public class SealedInterfaces {

    public static void main(String[] args) {

    }



    public void processReward(Reward reward) {
        // Polymorphic behavior based on the specific subtype
        switch (reward) {
            case GoldCard g -> System.out.println("VIP: " + g.holderName());
            case SilverCard s -> System.out.println("Standard: " + s.holderName());
            // No default needed if the interface is 'sealed'!
        }
    }

}


// Encapsulating the hierarchy: Only 'GoldCard' and 'SilverCard' can be Rewards
sealed interface Reward permits GoldCard, SilverCard {
}

// Encapsulating data: Immutable by design
record GoldCard(String holderName, int points) implements Reward {
}

record SilverCard(String holderName) implements Reward {
}