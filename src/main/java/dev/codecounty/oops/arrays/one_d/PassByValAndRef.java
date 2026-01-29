package dev.codecounty.oops.arrays.one_d;

public class PassByValAndRef {


    public static void main(String[] args) {

        int arr[] = {23, 345, 45, 54, 45, 50};
        int n = 20;

        System.out.println(arr);
        new PassByValAndRef().compute(n, arr);
        System.out.println(n);
        System.out.println(arr[0]);
    }

    void compute(int n, int[] arr) {
        n = 100;
        arr[0] = -1;
        System.out.println(arr);
    }
}