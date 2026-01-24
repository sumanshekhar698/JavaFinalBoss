package dev.codecounty.basics;

public class NumberFormatsInJava {

    public static void main(String[] args) {


        int a = 0b1010101;//Binary
        int x = 3467;//Decimal
        int y = 03467;//Octal
        int z = 0x3467AB;//Hex

        System.out.println(a);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        long salaryOfAnubhav = 10_000_000_000L;//Using underscores for better readability
        System.out.println(salaryOfAnubhav);

    }
}