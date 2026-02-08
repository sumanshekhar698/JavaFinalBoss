package dev.codecounty.deep.edge_cases;

import java.math.BigInteger;

public class BigIntDemo {
    public static void main(String[] args) {
        // 1. A number slightly smaller than Long.MAX_VALUE
        long maxLong = Long.MAX_VALUE; 
        
        // 2. Trying to multiply it by 10 using long (CRASHES/OVERFLOWS)
        long overflowed = maxLong * 10;
        System.out.println("Overflowed Long: " + overflowed);
        // Output: -10 (The math "wrapped around" and broke)

        // 3. Using BigInteger (LIMITLESS)
        BigInteger bigNum = BigInteger.valueOf(maxLong);
        BigInteger result = bigNum.multiply(BigInteger.valueOf(10));
        System.out.println("BigInteger Result: " + result);
        // Output: 92233720368547758070 (Correct!)
    }
}