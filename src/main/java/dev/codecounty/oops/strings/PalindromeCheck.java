package dev.codecounty.oops.strings;

public class PalindromeCheck {
    public static boolean isPalindrome(String text) {
        if (text == null) return false;
        
        // Clean the string: remove spaces and make lowercase
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        
        // Reverse it
        String reversed = new StringBuilder(clean).reverse().toString();
        
        // Compare values
        return clean.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Race Car")); // true
        System.out.println(isPalindrome("Java"));     // false
    }
}