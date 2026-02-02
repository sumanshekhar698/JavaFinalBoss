package dev.codecounty.oops.encapsulation;

public class FinalDiscussion {

    public static void main(String[] args) {
        final float PI = 3.14159f;//final variables cannot be reinitialized
//        PI = 3.24242242f;//ERROR

        final int VALUE_OF_DOZEN;
        VALUE_OF_DOZEN = 12;
        System.out.println(VALUE_OF_DOZEN);
    }
}
