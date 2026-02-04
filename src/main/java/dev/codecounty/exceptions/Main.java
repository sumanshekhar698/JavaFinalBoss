package dev.codecounty.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main() {

        System.out.println("START");

        Scanner scanner = new Scanner(System.in);

        int[] arr = {23, 43, 5, 6, 0};

//        try {
            int num = scanner.nextInt();
            System.out.println(10 / arr[num]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception Occurred");
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
//            System.out.println("Exception Occurred");
//            e.printStackTrace();
//        } catch (InputMismatchException e) {
//            System.out.println("Exception Occurred");
//            e.printStackTrace();
//        } catch (Exception e) {//Always put the default Exception block at the end
//            System.out.println("Exception Occurred");
//            e.printStackTrace();
//        }


        System.out.println("END");
    }
}
