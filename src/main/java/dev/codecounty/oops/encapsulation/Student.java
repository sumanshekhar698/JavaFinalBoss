package dev.codecounty.oops.encapsulation;

public class Student {

    //private variables can ONLY be accessed within the class
    private int roll;
    private String name;
    String collegeName;

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public Student(int roll, String name, String collegeName) {
        this.roll = roll;
        this.name = name;
        this.collegeName = collegeName;
    }

    public String info() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
