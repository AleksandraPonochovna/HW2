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
        return year / 4 + year / 400 - year / 100;
    }
}
