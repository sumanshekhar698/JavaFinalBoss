package dev.codecounty.oops.abstraction.interfaces;

@FunctionalInterface
public interface Loksabha {

    void elect(int candidates);
//    void electDecision();

    static void members() {
        System.out.println("There are " + 543 + " members in Loksabha");
    }

    default void locationOfLokSabha() {
        System.out.println("Location is Delhi");
    }
}
