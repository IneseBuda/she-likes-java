package com.sda.she_likes_java.homework;

import java.util.Scanner;
//A story about bouncers in a disco
//Prepare a new class BouncersInDiscoStory and in it
//- get the user’s age, ability to sing well and height from the console
//- there are two bouncers in the disco: young and old
//- Young checks if the person is adult, tall (or short :)) and can sing well
//- Old has some kind of sight problem - so if any of the conditions are met, the person can enter the disco
//- people try to cheat, so if someone is rejected by the young bouncer they try again with the old one:)

public class BouncersInDiscoStory {
    public static void main(String[] args) {
        System.out.println("Homework BouncersInDiscoStory");
        System.out.println("Entrance with young bouncer.");
        System.out.println("Hello, how old are You?");
        Scanner inputReader = new Scanner(System.in);
        String declinMessage = "Sorry, you are not allowed to go to party!";

        int age = inputReader.nextInt();
        System.out.println("Let me know your hight:");
        double hight = inputReader.nextDouble();
        System.out.println("You are very good singer! True or False?");
        boolean canSing = inputReader.nextBoolean();

        boolean isAllowedToParty = age >= 18 && hight >= 1.90;

        if (isAllowedToParty && canSing) {
            System.out.println("Have a great time in party!");
        } else {
            System.out.println(declinMessage);

            System.out.println("\n Entrance with old bouncer.");
            System.out.println("Visitor: Can I come in?");
            System.out.println("Old bouncer: How old are You?");
            int secondAge = inputReader.nextInt();
            System.out.println("Let me know your hight:");
            double secondHight = inputReader.nextDouble();
            System.out.println("You are very good singer! True or False?");
            boolean canSingAgain = inputReader.nextBoolean();

            boolean isAllowedToPartyStill = age >= 18 || hight >= 1.90;

            if (isAllowedToPartyStill || canSing) {
                System.out.println("Ok, welcome!");

            }


        }
    }
}
