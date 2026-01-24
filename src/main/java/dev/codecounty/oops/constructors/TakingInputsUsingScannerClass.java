package dev.codecounty.oops.constructors;

import java.util.Scanner;

public class TakingInputsUsingScannerClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Number");
        int inputNum = sc.nextInt();//Integer input
        System.out.println(inputNum);

        sc.nextLine();//Flushing

        System.out.println("Enter Sentence");
//        String word = sc.next();//Word input
        String sentence = sc.nextLine();//Sentence/Line Input
        System.out.println(sentence);
        System.out.println(sentence.length());


    }
}