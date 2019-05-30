package com.company;

import java.util.Scanner;

public class MathExpression {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MathExpression start = new MathExpression();
        System.out.print("Enter the first number: ");
        float firstNumber = input.nextFloat();
        System.out.print("Enter the first number: ");
        float secondNumber = input.nextFloat();
        System.out.print("Enter the first number: ");
        float result = input.nextFloat();
        System.out.print("Result is: ");
        System.out.print(start.checkMathExpression(firstNumber, secondNumber, result));
    }

    public boolean check (float firstNumber, float secondNumber, float result) {
        if (Math.abs((firstNumber + secondNumber) - result) <= 0.0001) {
            return true;
        }
         else {
            return false;
        }
    }
}
