package dev.codecounty.exceptions;

import java.util.Scanner;

public class ClassTest {

    public static void main() {

        System.out.println("Enter marks for grade");
        int marks = new Scanner(System.in).nextInt();
//        System.out.println(marks);// marks is of 90
        try {
            checkGrade(marks);
        } catch (LowMarksException e) {
            throw new RuntimeException(e);
        }

        System.out.println("END");

    }

    private static void checkGrade(int marks) throws LowMarksException {

        if (marks < 60 && marks >= 30) {
            throw new LowMarksException("Needs Improvement");
        } else if (marks < 30) {
            throw new LowMarksException("Extremely poor marks");
        }
    }
}


class LowMarksException extends Exception {
    public LowMarksException(String message) {
        super(message);
    }
}
