package dev.codecounty.oops.basics;

import java.lang.*;

public class WrapperClasses {

    public static void main(String[] args) {

        int x = 10;
        Integer x_ = new Integer(x);
        System.out.println(x_);


        Boolean bool_ = new Boolean(false);
        System.out.println(bool_);

        Boolean bool2 = false;


        int y = 100;
        Integer y_ = y;//Autoboxing

        int z = y_;//AutoUnboxing




    }


}