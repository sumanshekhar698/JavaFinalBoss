package dev.codecounty.dsa.pattern;

public class HalfSquare {


    public static void main(String[] args) {


        int n = 4;


        for (int i = 1; i <= n; i++) {//Changes row


            for (int j = 1; j <= n - i; j++) {//Prints the invert trend
                System.out.print("*");
            }

            for (int k = 1; k <= i; k++) {//Print the standard trend
                System.out.print(i);
            }

            System.out.println();//Change Line


        }
    }
}
