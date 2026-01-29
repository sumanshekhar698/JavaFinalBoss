package dev.codecounty.oops.arrays.one_d;

public class ArraysIntro {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[4] = 10;
        System.out.println(arr[4]);

        System.out.println(arr);
        System.out.println("Len :: " + arr.length);

        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
            arr[i]  = i*i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}