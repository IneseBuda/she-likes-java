package com.sda.she_likes_java.homework.exercise25;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Which country cities you would like to use?");
        System.out.println("Type 1 for Latvia");

        Scanner inputReader = new Scanner(System.in);
        String userChoice = inputReader.next();
        Country currentCountry = new Country("Latvia");
        if (userChoice.equals("Latvia")){
            currentCountry = MyCountriesWithCities.createLatviaCities();
            CountryCities latviaCities = new CountryCities();
            //latvia.fillWithCities(list);
          //  latviaCities.fillWithCities(list);
           // System.out.println(List.of(CountryCities) );
        }


    }

}
