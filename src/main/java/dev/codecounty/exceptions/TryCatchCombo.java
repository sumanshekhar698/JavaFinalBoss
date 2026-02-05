package dev.codecounty.exceptions;

import java.util.Scanner;

public class TryCatchCombo {

    public static void main() {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        try {//nested try catch is possible


        try {
            for (int i = 0; i < num; i++) {
                Thread.sleep(500);
                System.out.println(i);
            }
//                return;
//            System.exit(5);//forcefully shutting the program off
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally block executed");
            sc.close();
        }


//        } catch (Exception e) {
//
//        }

        Scanner sc2 = null;
        try {
            sc2 = new Scanner(System.in);
            System.out.println(8 / sc2.nextInt());
        } finally {
            sc2.close();
        }
    }

}
