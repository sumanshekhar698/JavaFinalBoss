package dev.codecounty.deep.edge_cases;

import java.math.BigDecimal;

public class TheMissingCentProblem {

    public static void main(String[] args) {
        double value = 1.00;
        for (int i = 1; i <= 10; i++) {
            value -= 0.10;
        }
        System.out.println(value);
        // Expected: 0.0
        // Actual Output: 0.00000000000000008271... (or similar)

        // --- Using BigDecimal (THE BANKING WAY) ---
        BigDecimal balanceBD = new BigDecimal("1.00");
        BigDecimal step = BigDecimal.valueOf(0.10);
        for (int i = 0; i < 10; i++) {
            balanceBD = balanceBD.subtract(step);
        }
        
        System.out.println("BigDecimal Balance: " + balanceBD);
        // Output: 0.00 (Perfectly exact)

    }
}
