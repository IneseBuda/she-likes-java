package com.sda.she_likes_java.functions;

public class CalculatorWihFunctions {
    public static void main(String[] args) {
        System.out.println("Let's start calculators");
        sum(10, 20);
        sum(1, 2);
    }

    public static int sum(int first, int second) {
        System.out.println("I'm no smart calculator");
        int result = first + second;
        System.out.println("Result of calculation is:" + result);
return result;

    }
}
