package dev.codecounty.oops.arrays.one_d;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 4, 5};
        int target = 2;

        int[] numsSorted = {1, 2, 3, 4, 5, 8, 10};

        int i = 0, j = numsSorted.length - 1;
        int index = -1;

        while (i <= j) {


            int mid = (i + j) / 2;

            if (target == numsSorted[mid]) {
                index = mid;
                break;
            } else if (target < numsSorted[mid]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }


        }

        System.out.println(index);


    }
}