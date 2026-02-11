package dev.codecounty.map;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 11, 15};
        int target = 9;

//        new TwoSum().twoSum(arr, target);
        int[] ints = new TwoSum().twoSumOptimized(arr, target);
        System.out.println(Arrays.toString(ints));


    }

    int[] twoSumOptimized(int[] arr, int target) {


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int complement = target - num;
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            } else {
                map.put(num, i);
            }


        }

        return new int[0];

    }

    int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};

                }

            }

        }
        return new int[0];
    }


}
