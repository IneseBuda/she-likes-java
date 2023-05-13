package com.sda.she_likes_java.homework.exercise25;


import com.sda.she_likes_java.collections.list.WordsBilingual;

import java.util.ArrayList;
import java.util.List;

public class CountryCities {
    private List<City>listOfCities;
    public CountryCities(){listOfCities = new ArrayList<>();}
    public void fillWithCities(List<City>cityList){
       listOfCities.addAll(cityList);


    //public static String giveCitiesOfGivenCountry(){
       // Map<Country,List<City>> CitiesOfCountry =new HashMap<>();
       // String country = giveCitiesOfGivenCountry();
//if (country!=null){
    //System.out.println("Latvia cities are:" + List.of());
}
public void printCitiesOfCountry(String country){
        for(MyCountriesWithCities askedCountry: listOfCities){
            if(askedCountry.getName().equals(country)){
                String print = askedCountry.getList.of();
                System.out.println("Here are the list:"+ print, country);
            }
        }

}

      //  return country;
    }


