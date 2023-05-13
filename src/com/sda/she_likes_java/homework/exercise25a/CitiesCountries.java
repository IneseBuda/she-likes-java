package com.sda.she_likes_java.homework.exercise25a;

import java.util.ArrayList;
import java.util.List;

public class CitiesCountries {

    private List<Country>countries;

    public CitiesCountries() {
        this.countries = new ArrayList<>();
    }

    public void addCountriesList(Country countriesList){
        countries.add(countriesList);
    }
    public void displayCountriesList(){
        System.out.println("Here countries list" + countries);
    }


}
