package com.company;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        year = leapYearCount(year);
        System.out.println(year);
    }

    public static int leapYearCount(int year) {
        if (year >= 0 & year <= 2019) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                year = year / 4;
            } else {
                year = 0;
            }
        } else {
            System.out.println("Error! The year must be from 0 to 2019! ");
            year = 0;
        }
        return year;
    }
}
