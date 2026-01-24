package dev.codecounty.basics;

public class Operators {
    public static void main(String[] args) {


//        Assignment Operator

        int x = 5;

//        Arithmetic Operator  + - / * %
        x = 10 % 3;
        System.out.println(x);
        x = 965;
        System.out.println(965 % 10);
        System.out.println(965 / 10);


//        Unary Operators
        int y;
//        System.out.println(y);// you cannot use a local variable unless its intialized

        y = 10;
        System.out.println(y++);
        System.out.println(y);
        System.out.println(++y);
        System.out.println(y);

        x = 100;
        y = 90;
        x = ++x - --y + --x + y++ - x++ - --y - x--;
        System.out.println(x);
        System.out.println(y);


//        Shorthand Operators
        x = 9;
        x = x + 100;
        x += 100;
        x += 1;
        x *= 5;


//        Bit Wise Operators
        System.out.println(7 & 5);
        System.out.println(7 | 5);
        System.out.println(7 ^ 5);
        System.out.println(7 ^ 7);
        System.out.println(~7);

        System.out.println(8 >> 1);
        System.out.println(8 << 1);
        System.out.println(99 >>> 1);


    }

}