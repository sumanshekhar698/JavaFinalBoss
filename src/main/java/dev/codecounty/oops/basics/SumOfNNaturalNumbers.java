package dev.codecounty.oops.basics;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        //TODO : Calculate sum of first n natural numbers


        int sum = 0;
//        for (int i = 0; i <= num; i++) {
//            sum += i;
//        }

        if (num > 0) {
            sum = (num * (num + 1)) / 2;
        }

        System.out.println(sum);
        scanner.close();
    }
}