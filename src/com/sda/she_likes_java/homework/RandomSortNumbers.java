package com.sda.she_likes_java.homework;


import javax.swing.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


//Exercise 12
//Draw three numbers using the Random.nextInt() function.
//Sort them and output them from smallest to largest.
public class RandomSortNumbers {
    public static void main(String[] args) {


        Random randomNumber = new Random();

        int number1 = randomNumber.nextInt(10);
        System.out.println(number1);
        int number2 = randomNumber.nextInt(10);
        System.out.println(number2);
        int number3 = randomNumber.nextInt(10);
        System.out.println(number3);

        int[] arr_int = {number1, number2, number3};
        Arrays.sort(arr_int);
        System.out.println("Numbers from smallest to largest" + Arrays.toString(arr_int));
    }
}


