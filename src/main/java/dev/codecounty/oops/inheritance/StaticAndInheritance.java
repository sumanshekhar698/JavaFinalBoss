package dev.codecounty.oops.inheritance;

public class StaticAndInheritance {

    public static void main(String[] args) {
        BloodWorkReport report = new BloodWorkReport();
        report.printHeader();
        report.printFooter();

    }
}

class LabReport {

    int cost = 1000;
    // Static method
    static void printHeader() {
        System.out.println("HSR PHARMA: General Lab Report");
    }

    // Instance method
    void printFooter() {
        System.out.println("Page 1 of 1");
    }
}

class BloodWorkReport extends LabReport {
    // This "hides" the static method in the parent class
    static void printHeader() {
        System.out.println("HSR PHARMA: Blood Work Analysis");
    }

    // This "overrides" the instance method
    @Override
    void printFooter() {
        System.out.println("End of Blood Work Summary");
    }
}
