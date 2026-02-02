package dev.codecounty.oops.inheritance.inner;

import dev.codecounty.oops.inheritance.ClinicalTrial;

public class CancerResearch extends ClinicalTrial {
    public void runAnalysis() {
        // This works! Because CancerResearch IS A ClinicalTrial
        System.out.println("Analyzing: " + researchFormula);
    }
}