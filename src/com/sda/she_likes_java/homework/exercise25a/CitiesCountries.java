package com.sda.she_likes_java.homework.exercise25a;

import java.util.Map;

public class CitiesCountries {

public static void citiesInCountries(Map<City, Country>cityCountryMap){
   for( Map.Entry<City, Country> item: cityCountryMap.entrySet()){
        System.out.println("Key: "+ item.getKey());
        System.out.println("Value: "+ item.getValue());

    }
}

}

