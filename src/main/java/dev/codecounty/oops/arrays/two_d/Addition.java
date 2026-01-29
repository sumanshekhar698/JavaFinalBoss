package dev.codecounty.oops.arrays.two_d;

import java.util.Arrays;

public class Addition {
    public static void main(String[] args) {

        int[][] matA = {
                {2, 4, 7},
                {32, 6, 0}
        };

        int[][] matB = {
                {23, 90, 7},
                {23, 234, -23}
        };

        addTwoMatrices(matA, matB);
    }

    private static void addTwoMatrices(int[][] matA, int[][] matB) {
        int rowsA = matA.length;
        int rowsB = matB.length;

        int columnsMatA = matA[0].length;
        int columnsMatB = matB[0].length;

        //check if dimension are matching
        if ((rowsA == rowsB) && (columnsMatA == columnsMatB)) {
            int[][] result = new int[rowsA][columnsMatA];
            for (int i = 0; i < matA.length; i++) {//Addition
                for (int j = 0; j < matA[i].length; j++) {

                    result[i][j] = matA[i][j] + matB[i][j];

                }
            }

            for (int i = 0; i < result.length; i++) {
                System.out.println(Arrays.toString(result[i]));
            }

        }


    }
}