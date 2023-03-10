package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoVersion5DoubleAgeFromConsole {
    public static void main(String[] args) {
        System.out.println("Party time???");

        System.out.println("Somebody is coming to club");
        System.out.println("Hi, how old are you?");

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "Sorry, go home";
        int age = inputReader.nextInt();
        System.out.println("Let me know your hight:");
        //. or , is selectd based of region
        double height = inputReader.nextDouble();
        boolean isAllowedToParty = age >= 18 &&  height >= 200;
        //
        if (!isAllowedToParty) {
            System.out.println(declineMessage);

        }else{
            System.out.println("Have a great time in party!");

        }
    }
}
