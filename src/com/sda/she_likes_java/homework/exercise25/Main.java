package com.sda.she_likes_java.homework.exercise25;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CountryCities countriesList = new CountryCities();
        Country country1 = new Country("Lithuania");
        Country country2 = new Country("Latvia");

        countriesList.addCountryToList(country1);
        countriesList.addCountryToList(country2);

        countriesList.displayCountriesList();

        CountryCities citiesOfLithuania = new CountryCities();
        CitiesOfLithuania cities1 = new CitiesOfLithuania("Vilnius");
        CitiesOfLithuania cities2 = new CitiesOfLithuania("Palanga");
        citiesOfLithuania.addCitiesOfLithuania(cities1);
        citiesOfLithuania.addCitiesOfLithuania(cities2);
        citiesOfLithuania.displayCitiesOfLithuania();

        CountryCities Country1 = citiesOfLithuania;
        CountryCities.addall(citiesOfLithuania);
        System.out.println("Here are cities of Lithuania" + citiesOfLithuania);

        CountryCities citiesOfLatvia = new CountryCities();
        CitiesOfLatvia cities3 = new CitiesOfLatvia("Riga");
        CitiesOfLatvia cities4 = new CitiesOfLatvia("Liepaja");
        citiesOfLatvia.addCitiesOfLatvia(cities3);
        citiesOfLatvia.addCitiesOfLatvia(cities4);
        citiesOfLatvia.displayCitiesOfLatvia();

        CountryCities Country2 = citiesOfLatvia;
        CountryCities.addall(citiesOfLatvia);
        System.out.println("Here are cities of Latvia" + citiesOfLatvia);


    }


}

