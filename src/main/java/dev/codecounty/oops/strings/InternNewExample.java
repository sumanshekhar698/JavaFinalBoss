package dev.codecounty.oops.strings;

public class InternNewExample {
    public static void main(String[] args) {
        // Create a string dynamically (not a literal)
        // This lives on the Heap, and "Java" is NOT in the pool yet.
        String s1 = new String("Java");

        // 1. intern() looks in the pool for "Java".
        // 2. It doesn't find it.
        // 3. It ADDS "Java" to the pool.
        // 4. s2 now points to the pool version.
        String s2 = s1.intern();

        // This will be true because s3 finds the value s1 just put there!
        String s3 = "Java";

        System.out.println(s2 == s3); // true
    }
}