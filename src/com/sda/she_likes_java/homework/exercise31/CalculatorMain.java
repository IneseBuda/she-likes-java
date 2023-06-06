package com.sda.she_likes_java.homework.exercise31;

public class CalculatorMain {

    public static void main(String[] args) {
        Operations calculator = new Calculator();
        count(calculator);
        calculator.subtract();
        int div = calculator.divide();
        System.out.println("Divide :" + div);

        calculator.multiply();
        int mult = calculator.multiply();
        System.out.println("Multiply : " + mult);

        calculator.subtract();
        int sub = calculator.subtract();
        System.out.println("Subtract : " + sub);

        Operations addition = () -> {
            System.out.println("Addition");

           return calculator.addition();
        };
        System.out.println(addition.addition());

    }

    public static void count(Operations counter) {
        counter.divide();
        counter.multiply();
        counter.subtract();

    }
}
