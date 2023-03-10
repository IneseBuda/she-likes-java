package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("calculator...");
        System.out.println("Calculation sum of two com.sda.she_likes_java.numbers");
        System.out.println("Provide first number:");
        int firstNumber;
        int secondNumber;
        //TODO explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        //\n free new line
        System.out.println("\n\n\nProvide second number:");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        System.out.println();
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);


    }

}
