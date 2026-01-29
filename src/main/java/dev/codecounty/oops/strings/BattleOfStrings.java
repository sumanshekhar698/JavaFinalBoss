package dev.codecounty.oops.strings;

public class BattleOfStrings {

    public static void main(String[] args) {


        String s1 = "Hello";
        StringBuilder sb = new StringBuilder("Hello");

        long start = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
//            s1 += " World";
        sb.append(" World");
        }
        long end = System.nanoTime();


        System.out.println(end - start);
        //74628372084 String time

    }
}