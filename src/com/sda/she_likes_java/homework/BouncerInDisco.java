package com.sda.she_likes_java.homework;

import java.util.Scanner;

//Exercise 9.
//Bouncer in a disco
//Prepare a new class BouncerInDisco and in it
//- get the user’s age and height from the console
//- only people who are at least 16 years old and taller (or shorter than - at your choice) can enter the disco
//- print a text saying how the verification went in both cases
public class BouncerInDisco {
    public static void main(String[] args) {
        System.out.println("Homework BouncerInDisco:");
        boolean condition = false;
        if (condition) {
            System.out.println("This will be run only when condition is false");
        } else {
            System.out.println("This will be run when condition is true");
        }
        int age = 16;
        int hight = 170;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are You");
        int personAge = inputReader.nextInt();
        boolean isKid = age < 16;
        System.out.println("is kid: " + isKid);
        System.out.println("Tell me how tall are You in cm?");
        int personHight = inputReader.nextInt();
        boolean isShort = hight < 170;
        System.out.println("is short: " + isShort);

        if (personAge >= 16)
            if (personHight >= 170) {
                System.out.println("Welcome to disco");
            } else {
                System.out.println("You do not meet the criteria for attending a disco!");
                if (personAge < 16)
                    if (personHight < 170) {
                        System.out.println("Welcome to disco");
                    } else {
                        System.out.println("You do not meet the criteria for attending a disco!");

                    }
            }
    }
}








