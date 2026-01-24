package dev.codecounty.basics;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //int

        byte a = 33;//TODO find how the bits are handled in the memory
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        short b = 678;
        int c = 6788;
        long d = 6788766;
        long phoneNumber = 9006567388L;//8 bytes
        System.out.println(phoneNumber);

        b = a;//Data Broadening
//        a = b;// So you cannot put a data type that has higher memory requiremnet in a lower memory var IMPLICITLY
        System.out.println(b);


//        boolean size depends on JVM / JDK
        boolean isJavaEasy = false;
        isJavaEasy = true;


//        char
        char ch = 'a';
        char rupee = '₹';
        int rupeeCode = rupee;
        System.out.println(rupeeCode);

        int x = 686684;
        char xChar = (char) x;
        System.out.println(xChar);


//        floats TODO REesearch about IEEE format
        float valueOfPi = 3.14159F;//4 bytes
        System.out.println(valueOfPi);

        phoneNumber = 9006567388L;//8 bytes
        System.out.println(phoneNumber);
        float phoneFloat = phoneNumber;
        System.out.println(phoneFloat);


        double valueOfPiDouble = 3.14159;// 8 Bytes
        System.out.println(valueOfPiDouble);


    }
}