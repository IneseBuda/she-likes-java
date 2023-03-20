package com.sda.she_likes_java.homework;


import javax.swing.*;
import java.util.Random;


//Exercise 12
//Draw three numbers using the Random.nextInt() function.
//Sort them and output them from smallest to largest.
public class RandomSortNumbers {
    public static void main(String[] args) {


        Random random = new Random();

        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        int number3 = random.nextInt(10);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        String fromSmallestToLargest = number1 <=0; number2 != number1; number3>=number2;
        System.out.println("Random numbers from smallest to largest:" + fromSmallestToLargest);

    }
}
