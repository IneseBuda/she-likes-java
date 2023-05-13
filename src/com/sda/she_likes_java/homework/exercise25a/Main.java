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

        Map<City, Country>citiesInCountries = new HashMap<>();
        citiesInCountries.put(new City("Riga"), new Country("Latvia"));
        citiesInCountries.put(new City("Liepaja"),new Country("Latvia"));
        citiesInCountries.put(new City("Vilnius"), new Country("Lithuania"));
        System.out.println("City of given Country: ");
        citiesInCountries(citiesInCountries);
        System.out.println("Country for Riga: " + citiesInCountries.get(new City("Riga")));
    }
}
