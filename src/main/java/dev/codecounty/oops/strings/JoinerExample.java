package dev.codecounty.oops.strings;

import java.util.StringJoiner;

public class JoinerExample {
    public static void main(String[] args) {
        // Parameters: Delimiter, Prefix, Suffix
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        
        sj.add("Apple");
        sj.add("Banana");
        sj.add("Orange");
        
        System.out.println(sj.toString()); 
        // Output: [Apple, Banana, Orange]
    }
}