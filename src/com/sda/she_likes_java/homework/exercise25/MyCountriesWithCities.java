package com.sda.she_likes_java.homework.exercise25;

import java.util.List;

public class MyCountriesWithCities {

    public static CountryCities createLatviaCities() {
        List<City> list = List.of(
                new City("Riga"),
                new City("Liepaja"),
                new City("Jurmala")
        );
       CountryCities latviaCities = new CountryCities();
latviaCities.fillWithCities(list);
     return latviaCities;

    }
}

