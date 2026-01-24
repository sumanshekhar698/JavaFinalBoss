package dev.codecounty.basics;

import java.time.Year;

public class FindALeapYear {

    public static void main(String[] args) {
        int year = 1900;
        boolean isLeapYear = false;

        if (year % 4 == 0) {//It might be a leap year
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }


        if (isLeapYear) {
            System.out.println("LEAP");
        } else {
            System.out.println("NOT LEAP");
        }

        boolean isLeap = Year.isLeap(1900); // Returns false

    }


    boolean findLeap(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return isLeapYear;
    }
}