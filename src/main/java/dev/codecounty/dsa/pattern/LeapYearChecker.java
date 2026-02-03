package dev.codecounty.dsa.pattern;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (dd-mm-yyyy): ");
        String input = scanner.nextLine();

        boolean isLeap = checkLeapUsingLocalDate(input);
        System.out.println(isLeap);


    }

    static boolean checkLeapUsingStringSplit(String input) {
        // 1. Split logic: [0]=dd, [1]=mm, [2]=yyyy
        String[] parts = input.split("-");


        // 2. Extraction: Convert the year part to an int
        int year = Integer.parseInt(parts[2]);

        // Leap year logic: divisible by 4, but not 100 (unless also divisible by 400)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    static boolean checkLeapUsingSubString(String input) {

        //  Substring alternative (if you didn't want to split):
        String yearString = input.substring(input.lastIndexOf("-") + 1);


        int year = Integer.parseInt(yearString);

        // Leap year logic: divisible by 4, but not 100 (unless also divisible by 400)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


    }

    static boolean checkLeapUsingLocalDate(String input) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Parsing the string into a date object
        LocalDate date = LocalDate.parse(input, formatter);
        boolean isLeapYear = date.isLeapYear();

        // Extracting yyyy as an int
//        int yearNum = date.getYear();


        return isLeapYear;


    }
}