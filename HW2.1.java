package com.company;

public class BooleanExpression {

    public static void main(String[] args) {
        BooleanExpression start = new BooleanExpression();
        boolean result = start.booleanExpression(true, true, false, false);
        System.out.println(result);
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (a & b) ^ (c & d) || (a & c) ^ (b & d);
    }
}

