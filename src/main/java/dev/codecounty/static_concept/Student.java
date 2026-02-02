package dev.codecounty.static_concept;

public class Student {

    int id;
    String name;
    static String collegeName;

    // a static block is executed before the main method and object creation only once
    static {
        collegeName = "CodeCounty";
        System.out.println("Static block 1 executed");
    }

    // an instance block is executed before every object creation
    {
        System.out.println("Instance block 1 executed");
    }


    static {
        System.out.println("Static block 2 executed");
    }

    {
        System.out.println("Instance block 2 executed");
    }

    static {
        System.out.println("Static block 3 executed");
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
//        this.collegeName = collegeName;// we can access
    }

    static void callMe(){
        System.out.println("Hello from static method");
        System.out.println(collegeName);// VVI: we can access static variables from static methods,
        // but we cannot access instance variables and methods
    }


    public String info() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
