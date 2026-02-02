package dev.codecounty.deep.int_objects;

public class DoubleObjects {

    public static void main(String[] args) {

        /*
        *
        * Most integral types follow the same rule as Integer. They cache values from -128 to 127.

        Byte: Caches all possible values (since a byte only goes from -128 to 127 anyway).

        Short & Long: Both cache the same range as Integer (-128 to 127).

        Character: Caches from \u0000 to \u007f (0 to 127 in decimal), covering the standard ASCII set.*/




        /*
        *
        * Float and Double do not have a cache.
        * Why? Because between any two integers (like 1 and 2), there are an infinite number of floating-point values
        *
        *   (1.1, 1.01, 1.001...). Caching them would be impossible and wouldn't provide any performance benefit.
        *
        *
        *
        * */
        Double d1 = 1.0;
        Double d2 = 1.0;
        System.out.println(d1 == d2); // Always FALSE
        System.out.println(d1.equals(d2));





        /*
        * Boolean is the simplest. Since there are only two possible values,
        *  Java just creates two static objects: Boolean.TRUE and Boolean.FALSE.
        *  Every time you box a boolean, you're just pointing to one of those two.
        *
        * */
        System.out.println(Boolean.TRUE == Boolean.TRUE);

        /*The Golden Rule: Whenever you are dealing with Wrapper classes (Integer, Long, etc.), always use .equals().*/

    }
}
