package dev.codecounty.basics;

public class Conditionals {

    public static void main(String[] args) {


        int x = -100;

        if ((x > 0) && (x % 2 == 0)) {
            System.out.println("EVEN");
        } else if (x < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ODD");
        }

    }
}