package dev.codecounty.dsa.pattern;

import java.util.Scanner;

public class RhombusPattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the rhombus: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                // 1. Print leading spaces
                // As 'i' increases, the number of spaces decreases
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // 2. Print stars
                // Every row in a solid rhombus has 'n' stars
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }

                // 3. Move to the next line
                System.out.println();
            }
        } catch (Exception _) {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}