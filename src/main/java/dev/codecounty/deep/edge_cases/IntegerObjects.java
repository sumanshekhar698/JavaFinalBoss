package dev.codecounty.deep.edge_cases;

public class IntegerObjects {

    public static void main(String[] args) {
        /*To save memory and improve performance, Java doesn't create new objects for small integers.
         Instead, it keeps a pre-initialized "pool" of Integer objects in memory for the range -128 to 127.*/


        /*
         *
         * * Always use .equals() to compare Integer objects. Never use == unless you are specifically checking if they are the exact same instance.
         *
         * * The Range: The lower bound is fixed at -128, but the upper bound (127) can actually be tuned using a JVM argument (-XX:AutoBoxCacheMax=<size>) if you really need to.
         *
         * * Constructors bypass the cache: If you use new Integer(10), you are forcing Java to create a new object, ignoring the cache entirely. (Note: This constructor is deprecated in newer Java versions for this very reason).
         *
         * */

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b); // Prints TRUE (They point to the same cached object)

        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y); // Prints FALSE (They are two different objects on the heap)
    }
}
