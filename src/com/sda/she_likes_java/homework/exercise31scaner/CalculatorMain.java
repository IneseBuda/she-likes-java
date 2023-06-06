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
        System.out.println("Subtract :" + mult);

        calculator.divide(first, second);
        int div = first/second;
        System.out.println("Subtract :" + div);
    }
   /* private static int doTheMath(){
        int selectedNumber = 0;
        int first = 0;
        int second = 0;

        Operations calculator = new Calculator();
        if(selectedNumber == 2)
         calculator.subtract(first,second);
        int sub = first-second;
        System.out.println("Subtract : " + sub);
        return sub;
        };
    }*/

}


       /* Operations calculator = new Calculator();
        //count(calculator);
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

            return addition.addition();
        }


    public static void count(Operations counter) {
        counter.divide();
        counter.multiply();
        counter.subtract();

    }
}*/
