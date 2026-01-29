package dev.codecounty.oops.arrays.one_d;

import java.util.Arrays;

public class ArraysOfObjects {

    public static void main(String[] args) {

        String[] arr = {"Suman", "Mandeep", "Soujanya", "Adarsh"};
        String[] strArr = new String[5];

        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(strArr));

        Student[] students = {

                new Student(3,"Johnny"),
                new Student(1,"Mandeep"),
                new Student(2,"Soujanya"),
                new Student(4,"Adarsh")
        };
        Arrays.sort(students);


    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}