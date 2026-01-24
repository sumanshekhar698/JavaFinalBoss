package dev.codecounty.basics;

import java.util.Scanner;

public class SwitchCaseNew {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        outer: while (true) {
            System.out.println("\nEnter your choice");
            System.out.println("1: Coke\n2: Limca\n3: Pepsi\n0: Exit");
            int choice = scanner.nextInt();

            // Modern Switch Expression (JDK 14+) | 2020
            switch (choice) {
                case 1 -> System.out.println("Enjoy your Coke");
                case 2 -> System.out.println("Enjoy your Limca");
                case 3 -> System.out.println("Enjoy your Pepsi");
                case 0 -> {
                    System.out.println("Exiting...");
                    break outer; // Still works with labeled breaks
                }
                default -> System.out.println("Invalid Input");
            }
        }

        System.out.println("Thank You!!");
    }
}