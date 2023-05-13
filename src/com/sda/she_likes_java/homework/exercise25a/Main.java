package com.sda.she_likes_java.homework.exercise25a;

public class Main {

    public static void main(String[] args) {
        CitiesCountries countriesList = new CitiesCountries();
        Country country = new Country("Latvia");
        Country country1 = new Country("Lithuania");

        countriesList.addCountriesList(country);
        countriesList.addCountriesList(country1);

        countriesList.displayCountriesList();
    }
}
