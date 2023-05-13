package com.sda.she_likes_java.homework.exercise25a;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Country {
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public Country() {this.country = new ArrayList<>();
        this.country = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country1 = (Country) o;
        return Objects.equals(name, country1.name) && Objects.equals(country, country1.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
    private List<Country> country;



    public void addCountriesList(Country countriesList){
        country.add(countriesList);
    }
    public void displayCountriesList(){
        System.out.println("Here countries list" + country);
    }
}
