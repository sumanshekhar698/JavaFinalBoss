package dev.codecounty.oops.constructors;

import java.util.Scanner;

public class BulletProofScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        // This loop runs as long as the input is NOT an integer
        while (!sc.hasNextInt()) {
            System.out.println("That's not a number! Try again:");
            sc.next(); // This "consumes" the bad input so the loop can try again
        }

        int inputNum = sc.nextInt();
//        sc.nextLine(); // Still need to flush the buffer!

        System.out.println("Success! You entered: " + inputNum);
    }
}
