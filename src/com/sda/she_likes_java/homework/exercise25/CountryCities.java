package com.sda.she_likes_java.homework.exercise25;


import java.util.ArrayList;
import java.util.List;

public class CountryCities {


   private List <Country> countries;
   public CountryCities(){this.countries=new ArrayList<>();
      this.countries = new ArrayList<>();
      this.citiesOfLithuanias = new ArrayList<>();
   }

   @Override
   public String toString() {
      return "CountryCities{" +
              "countries=" + countries +
              ", citiesOfLithuanias=" + citiesOfLithuanias +
              '}';
   }

   public static void addall(CountryCities citiesOfLithuania) {
   }

   public void addCountryToList(Country country){countries.add(country);

   }
   public void displayCountriesList(){
       System.out.println("Here are counties to choose " + countries);
   }

   private List<CitiesOfLithuania> citiesOfLithuanias;

   public void addCitiesOfLithuania(CitiesOfLithuania citiesOfLithuania){
      citiesOfLithuanias.add(citiesOfLithuania);
   }
   public void displayCitiesOfLithuania(){
      System.out.println("Here are cities of Lithuania" + citiesOfLithuanias);
   }


}

