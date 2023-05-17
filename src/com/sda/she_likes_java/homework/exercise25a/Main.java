package com.sda.she_likes_java.homework.exercise25a;

import java.util.HashMap;
import java.util.Map;

import static com.sda.she_likes_java.homework.exercise25a.CitiesCountries.citiesInCountries;

public class Main {

    public static void main(String[] args) {
    Country countriesList = new Country();
        Country country = new Country("Latvia");
        Country country1 = new Country("Lithuania");

        countriesList.addCountriesList(country);
        countriesList.addCountriesList(country1);

        countriesList.displayCountriesList();

        Map<City, Country>citiesInCountriesOfLatvia = new HashMap<>();
        citiesInCountriesOfLatvia.put(new City("Riga"), new Country("Latvia"));
        citiesInCountriesOfLatvia.put(new City("Liepaja"),new Country("Latvia"));
        System.out.println("Cities of given Country: ");
        citiesInCountries(citiesInCountriesOfLatvia);
        for (City i:citiesInCountriesOfLatvia.keySet()
             ) {
            System.out.println(i);
        }

        Map<City, Country>citiesInCountriesOfLithuania = new HashMap<>();
        citiesInCountriesOfLithuania.put(new City("Vilnius"), new Country("Lithuania"));
        citiesInCountriesOfLithuania.put(new City("Palanga"), new Country("Lithuania"));
        System.out.println("Cities of given Country: ");
        citiesInCountries(citiesInCountriesOfLithuania);
        //System.out.println("Country for Riga: " + citiesInCountries.get(new City("Riga")));
        for (City i:citiesInCountriesOfLithuania.keySet()
             )
            System.out.println(i);
        }
    }

