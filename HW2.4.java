package com.company;

import java.util.Scanner;

public class FlipBit {

    public static void main(String[] args) {
        FlipBit start = new FlipBit();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();
        System.out.print("Enter bit index: ");
        int bitIndex = input.nextInt();
        System.out.print(start.flipBit(number, bitIndex));
    }

    public int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex-1);
    }
}
