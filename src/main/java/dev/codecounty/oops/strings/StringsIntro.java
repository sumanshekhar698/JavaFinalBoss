package dev.codecounty.oops.strings;

public class StringsIntro {

    public static void main(String[] args) {

        String s2 = "Hello kitty";
        String s3 = "Hello kitty";
        String s1 = new String("Hello kitty");
        String s4 = new String("Hello kitty");


        if (s1 == s4) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }


        if (s1.equals(s2)) {
            System.out.println("EQUAL VALUE");
        } else {
            System.out.println("NOT EQUAL VALUE");
        }

        String s5 = "hello kitty";
    }
}