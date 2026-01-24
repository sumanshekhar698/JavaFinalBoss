package dev.codecounty.oops.strings;

public class RealInternTest {
    public static void main(String[] args) {
        // We create "Java17" by combining parts. 
        // "Java17" does NOT exist as a literal in our code yet.
        String s1 = new StringBuilder("Java").append("17").toString();

        // 1. intern() looks for "Java17". It's NOT in the pool.
        // 2. It ADDS "Java17" to the pool.
        // 3. s2 points to that new pool entry.
        String s2 = s1.intern();

        // 4. s3 is a literal. It looks in the pool and finds what s2 just put there.
        String s3 = "Java17";

        System.out.println(s2 == s3); // true
        System.out.println(s1 == s2); // true (In Java 7+, intern() can point to the existing heap object!)
    }
}