package com.sda.she_likes_java.homework.exercise25;

import java.util.List;

public class MyCountriesWithCities {

    public static Country createLatviaCities() {
        List<City> list = List.of(
                new City("Riga"),
                new City("Liepaja"),
                new City("Jurmala")
        );
       Country latvia= new Country("Latvia");
latvia.fillWithCities(list);
     return latvia;

    }
}

