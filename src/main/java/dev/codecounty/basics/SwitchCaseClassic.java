package dev.codecounty.basics;

import java.util.Scanner;

public class SwitchCaseClassic {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        outer:
        while (flag) {
            System.out.println("\nEnter your choice");
            System.out.println("1: Coke\n2: Limca\n3: Pepsi\n0: Exit");
            int choice = scanner.nextInt();
/*            if (choice == 1) {
                System.out.println("Enjoy your Coke");
            } else if (choice == 2) {
                System.out.println("Enjoy your Limca");
            } else if (choice == 3) {
                System.out.println("Enjoy your Pepsi");`
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Wrong Input");
            }*/
            switch (choice) {//swich case is good for menu-driven programs
                case 1: {
                    System.out.println("Enjoy your Coke");
                    break;//break is mandatory as it may exhibit a cascading effect
                }
                case 2: {
                    System.out.println("Enjoy your Limca");
                    break;
                }
                case 3: {
                    System.out.println("Enjoy your Pepsi");
                    break;
                }
                case 0: {
//                    System.exit(8);
//                    flag = false;
                    break outer;
                }
                default: {
                    System.out.println("Invalid Input");
                    break;
                }
            }
        }


//        System.out.println("Thank You!!");

    }
}