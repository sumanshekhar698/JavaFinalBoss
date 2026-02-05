package dev.codecounty.exceptions;

import java.util.Scanner;

public class TryWithResource {

    public static void main() {


        //Since Scanner is an indirect child of AutoCloseable so we can put in try with resource
        // and it will be auto closed
        try (Scanner sc = new Scanner(System.in);
             Scanner sc2 = new Scanner(System.in);
        ) {
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                Thread.sleep(500);
                System.out.println(i);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally block executed");
//            sc.close();
        }


    }
}
