package dev.codecounty.oops.arrays.one_d;

public class MissingNNaturalNumber {


    public static void main(String[] args) {


        int n = 5;
        int[] nums = {4, 2, 1, 3};

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans ^= i;
        }


        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }

        System.out.println(ans);
    }


}