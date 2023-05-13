package com.sda.she_likes_java.homework.exercise25;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which country cities you would like to use?");
        System.out.println("Type 1 for Latvia");

        Scanner inputReader = new Scanner(System.in);
        String userChoice = inputReader.next();
        CountryCities currentCountry;
        if (userChoice.equals("1")){
            currentCountry = MyCountriesWithCities.createLatviaCities();
            System.out.println("Here are Latvia cities" );
        }

    }
}
