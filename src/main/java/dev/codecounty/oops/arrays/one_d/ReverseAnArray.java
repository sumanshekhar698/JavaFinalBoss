package dev.codecounty.oops.arrays.one_d;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {879, 2, -3, 4, 5};

        int i = 0, j = arr.length - 1;

        while (i <= j) {
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

    }
}