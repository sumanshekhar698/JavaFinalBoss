package dev.codecounty.oops.arrays.one_d;

import java.util.Arrays;

public class VarArgs {

    public static void main(String... suman) {

        System.out.println(suman.length);//4
        System.out.println(Arrays.toString(suman));
        new VarArgs().callMe("hey", 7, 89, 32);

    }

//    private  void callMe(int x, int y) {
//    }

    private void callMe(String str, int... x) {
        System.out.println(x.length);
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

    }
}