package dev.codecounty.exceptions;

public class MainError {

    static int counter = 0;

    public static void main() {
        call();
    }


    static void call() {

        System.out.println("Calling " + ++counter);
        call();
    }
}
