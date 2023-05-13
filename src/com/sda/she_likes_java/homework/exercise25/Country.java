package com.sda.she_likes_java.homework.exercise25;

import java.util.Objects;

/*
Create the Cities Countries class
- class should have the following methods
- give names of countries
- give the cities in given country
- use appropriate structures to hold the data
Create a Main class to test your class
 */
public class Country {
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name);
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


}
