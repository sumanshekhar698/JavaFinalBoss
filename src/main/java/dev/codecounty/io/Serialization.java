package dev.codecounty.io;

import java.io.*;

public class Serialization {


    public static void main(String... args) {


        Student st1 = new Student(23, "Sam");
        System.out.println(st1);

        File path = new File(FilePaths.SAMPLE_FILE_ABSOLUTE_PATH);

        if (path.exists() && path.isFile()) {

            try (FileOutputStream fos = new FileOutputStream(path);
                 ObjectOutputStream oos = new ObjectOutputStream(fos);

            ) {
                oos.writeObject(st1);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("Invalid Path");
        }


    }
}

class Student implements Serializable {
    transient int age;
    String name;


    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}