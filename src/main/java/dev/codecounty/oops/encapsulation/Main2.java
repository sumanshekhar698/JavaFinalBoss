package dev.codecounty.oops.encapsulation;

public class Main2 {

    public static void main(String... args) {


        StudentRecord st1 = new StudentRecord(6, "Deepender", "I LOVE LPU");
        System.out.println(st1);
        System.out.println(st1.name());
        System.out.println(st1.collegeName());
        System.out.println(st1.roll());


    }
}
