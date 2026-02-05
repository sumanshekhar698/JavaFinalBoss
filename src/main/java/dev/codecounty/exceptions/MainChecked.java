package dev.codecounty.exceptions;

public class MainChecked {

    public static void main() {


        for (int i = 0; i < 10; i++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }


    }
}
