package dev.codecounty.oops.strings;

public class RotatedStringCheck {

    public static void main(String[] args) {
        String s1 = "apple";

        String s2 = "pplea";

        String s3 = s2 + s2;
        System.out.println(s3);

        System.out.println(s3.contains(s1));
    }
}