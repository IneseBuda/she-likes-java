package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class FunctionBouncerInDiscoStory {
    public static void main(String[] args) {
        System.out.println("Let's start BouncerInDiscoStory!");
        checkedByYoungBouncer();
        checkedByOldBouncer();

    }

    public static boolean checkedByYoungBouncer() {
        System.out.println("First try with young bouncer!");
        System.out.println("Can I go to party?");
        int age;
        double hight;
        boolean canSing;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("How old are You?");
        age = inputReader.nextInt();
        System.out.println("How tall are You?");
        hight = inputReader.nextDouble();
        System.out.println("Can You sing well? True or False");
        canSing = inputReader.nextBoolean();
        boolean canEnterTheParty = age >= 18 && hight >= 1.90 && canSing;
        if (canEnterTheParty) {
            System.out.println("Welcome to party!");
        } else {
            System.out.println("Please, go home!");
        }
        return canEnterTheParty;

    }

    public static boolean checkedByOldBouncer() {
        System.out.println("Second try to get in through older bouncer!");
        System.out.println("Visitor:Hello! Could you let me in?");
        int age;
        double hight;
        boolean canSing;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Old bouncer:How old are You?");
        age = inputReader.nextInt();
        System.out.println("How tall are You?");
        hight = inputReader.nextDouble();
        System.out.println("Can You sing well? True or False");
        canSing = inputReader.nextBoolean();
        boolean canEnterTheParty = age >= 18 || hight >= 1.90 || canSing;
        if (canEnterTheParty) {
            System.out.println("Ok, come in!");
        } else {
            System.out.println("Please,really go home!");
        }

        return canEnterTheParty;
    }
}