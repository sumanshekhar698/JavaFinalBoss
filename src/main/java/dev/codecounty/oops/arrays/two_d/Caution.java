package dev.codecounty.oops.arrays.two_d;

public class Caution {


    public static void main(String[] args) {
        int[][] mat = {
                {2,54,65},
                {23,453,3}

        };


//        int[][] cloned = mat.clone();

        int[][] realClone = new int[mat.length][];
        for (int i = 0; i < realClone.length; i++) {
            realClone[i] = mat[i].clone();
        }

        mat[0][0] = 20;
        System.out.println(realClone[0][0]);//clone not working

    }
}