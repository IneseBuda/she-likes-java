package com.sda.she_likes_java.homework.exercise31scaner;


import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        int first;
        int second;

        int selectedNumber;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Write first number from 0 to 10");
        first = inputReader.nextInt();
        System.out.println("Write first number from 0 to 10");
        second = inputReader.nextInt();

        System.out.print("\n1. Addition\n2. Subtract\n3. Multiply"
                + "\n4. Divide\n\nWhich math operation? "
                + "Enter your choice:  ");

        int selectednumber = inputReader.nextInt();

        Operations calculator = new Calculator();

        calculator.subtract(first, second);
        int sub = first - second;
        System.out.println("Subtract :" + sub);
        // doTheMath();

        calculator.multiply(first, second);
        int mult = first * second;
        System.out.println("Multiply :" + mult);

        calculator.divide(first, second);
        int div = first / second;
        System.out.println("Divide :" + div);

        Operations addition = (first1, second2) -> {
            int add = first1 + second2;
            System.out.println("Addition: " + add);

            return first1 + second2;
        };
        addition.addition(first, second);

    }
}

