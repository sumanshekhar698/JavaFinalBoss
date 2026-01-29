package dev.codecounty.oops.arrays.one_d;

import java.util.Arrays;

public class ArrayUtills {

    public static void main(String[] args) {
        int[] arr = {23, 43, 223, 24, 443, 4, 32};

        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, -1);

        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 1, 3, 4);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}