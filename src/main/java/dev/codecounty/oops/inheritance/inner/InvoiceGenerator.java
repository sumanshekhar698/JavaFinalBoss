package dev.codecounty.oops.inheritance.inner;


import dev.codecounty.oops.inheritance.ClinicalTrial;

public class InvoiceGenerator {

    public static void main(String[] args) {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        invoiceGenerator.printInvoice();
    }


    public void printInvoice() {
        ClinicalTrial trial = new ClinicalTrial();
        // ERROR: researchFormula has protected access in ClinicalTrial
//         System.out.println(trial.researchFormula);

        new CancerResearch().runAnalysis();
    }
}