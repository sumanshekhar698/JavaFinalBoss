package dev.codecounty.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        listOfStudents.add(new Student("Jack", 22));
        listOfStudents.add(new Student("Jane", 21));
        listOfStudents.add(new Student("Jill", 23));
        listOfStudents.stream().forEach(System.out::println);

        // 2. Using Comparator Implementation
//        Collections.sort(listOfStudents, new NameComparator());

//        3. Using Lambda fn
//        Collections.sort(listOfStudents,
//                (st1, st2) -> st1.name.compareTo(st2.name));

//        4. Using comparing fn
        Collections.sort(listOfStudents,
                Comparator.comparing(st -> st.name));
        System.out.println();
        listOfStudents.stream().forEach(System.out::println);


    }


}

class Student implements Comparable<Student> {//1. Modify the Student class
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    @Override
    public int compareTo(Student st1) {
        if (st1.age == this.age) {
            return 0;
        } else if (st1.age < this.age) {
            return 1;
        } else {
            return -1;
        }

    }
}

//2. Using Comparator
class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        return -st1.name.compareTo(st2.name);
    }
}
