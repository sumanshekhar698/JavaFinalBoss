package dev.codecounty.oops.abstraction.interfaces;

public interface ComplexCase {

    //  Java 8 onwards
    static void call() {//static fn are allowed in interface which have a body
        System.out.println("Complex Case");
    }

    static void call1() {//static fn are allowed in interface which have a body
        System.out.println("Complex Case");
    }

    default void ring() {
        System.out.println("Ringing...");
    }

    default void ring1() {
        System.out.println("Ringing...");
    }
}
