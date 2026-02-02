package dev.codecounty.oops.inheritance;

public class ClinicalTrial {
    // Protected variable: Only children or package-peers can see this
    protected String researchFormula = "ALPHA-77";

    protected void displayFormula() {
        System.out.println("Current Formula: " + researchFormula);
    }
}