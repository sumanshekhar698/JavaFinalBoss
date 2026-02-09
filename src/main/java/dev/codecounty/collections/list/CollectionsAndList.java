package dev.codecounty.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsAndList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>() {{
            add(21);
            add(12);
            add(32);
            add(4);

        }};

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(list);
//        Collections.copy(list2, list);
        System.out.println(list);
        System.out.println(list2);

//        list.replaceAll(x -> x * 2);
//        System.out.println(list);

        ArrayList<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("John", 20));
        listOfStudents.add(new Student("Jane", 21));
        listOfStudents.add(new Student("Jack", 22));
        listOfStudents.add(new Student("Jill", 23));
//        Collections.sort(listOfStudents);


    }


}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }
}
