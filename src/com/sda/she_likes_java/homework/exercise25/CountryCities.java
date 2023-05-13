package com.sda.she_likes_java.homework.exercise25;


import java.util.ArrayList;
import java.util.List;

public class CountryCities {
    private List<City>country;
    public CountryCities(){country = new ArrayList<>();}
    public void fillWithCities(List<City>cityList){
      country.addAll(cityList);


    //public static String giveCitiesOfGivenCountry(){
       // Map<Country,List<City>> CitiesOfCountry =new HashMap<>();
       // String country = giveCitiesOfGivenCountry();
//if (country!=null){
    //System.out.println("Latvia cities are:" + List.of());
}
public void printCitiesOfCountry(){
        for(City askedCountry: country){
            if(askedCountry.getName().equals(country)){

                System.out.println(List.of());
            }
        }

}

      //  return country;
    }


