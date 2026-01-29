package dev.codecounty.oops.strings;

public class StringMutable {


    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("Hey");
        sb.append(" How are you");
        sb.append("?");
        System.out.println(sb);
        sb.insert(0, "Hello! ");
        System.out.println(sb);


    }
}