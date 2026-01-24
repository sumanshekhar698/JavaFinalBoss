package dev.codecounty.basics;

public class LoopsDeepDive {

    public static void main(String[] args) {

        //for loop
        int j = 0;
        loop2:
        for (; j <= 10; j++) {//initialisation; conditional;updation
            System.out.println("j -> " + j);
        }

        System.out.println(j);//

//        for (; ; ) {// Infinite for loop
//        }


        //while loop
        int i = 0;
        while (i < 10) {//comndition

            i++;
            if (i == 5) {
                continue;
            }

            System.out.println(i);


        }

        //do while loop runs atleast 1 time no matter what
        do {
            System.out.println("STOP ME");
        } while (6 < 2);

        int y = 10;
        boolean isPositive = y > 0 ? true : false;//Ternary Operator


    }
}