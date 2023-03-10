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

        int age = 16;
        int hight = 170;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are You?");
        int personAge = inputReader.nextInt();

        System.out.println("Tell me how tall are You in cm?");
        int personHight = inputReader.nextInt();


    if (personAge < 16) if (personHight < 170) {
            System.out.println("You do not meet the criteria for attending a disco!");
        } else {
            System.out.println("Welcome to disco");

        }
        if (personAge >= 16) if (personHight >= 170) {
            System.out.println("Welcome to disco");
        } else {
            System.out.println("You do not meet the criteria for attending a disco!");

            }
        }
    }








