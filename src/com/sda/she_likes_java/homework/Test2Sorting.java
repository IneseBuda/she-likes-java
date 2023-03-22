package com.sda.she_likes_java.homework;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Random;

public class Test2Sorting {

    public static void main(String[] args) {
        //Exercise 12
//Draw three numbers using the Random.nextInt() function.
//Sort them and output them from smallest to largest.


        Random randomNumber = new Random();

        int number1 = randomNumber.nextInt(10);
        System.out.println(number1);
        int number2 = randomNumber.nextInt(10);
        System.out.println(number2);
        int number3 = randomNumber.nextInt(10);
        System.out.println(number3);

        int min;
        int middle;
        int max;

        min = number1;
        if (number2 < min) {
            min = number2;
        }
       if (number3 < min) {
           min = number3;
       } else {
            min = number1;
        }
        middle = number2;
        if (number3 < middle && number3 > min) {
            middle = number3;
        }
        max = number3;
        if (number3 > middle && number3 > min) {
            max = number3;

        }
        System.out.println("Order of number from smallest:" + min + middle + max);
    }
}







