package dev.codecounty.oops.strings;

public class InternExample {
    public static void main(String[] args) {
        // 1. Literal: Automatically goes into the String Pool
        String s1 = "Hello";

        // 2. New Object: Lives on the Heap (outside the pool)
        String s2 = new String("Hello");

        // 3. Intern: Checks the pool for "Hello". It finds it (from s1) and points s3 there.
        String s3 = s2.intern();

        System.out.println("s1 == s2: " + (s1 == s2)); // false (Pool vs Heap)
        System.out.println("s1 == s3: " + (s1 == s3)); // true (Both point to Pool)
    }
}