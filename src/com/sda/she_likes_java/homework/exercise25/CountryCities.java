package com.sda.she_likes_java.homework.exercise25;


import java.util.ArrayList;
import java.util.List;

public class CountryCities {
   private List <Country> countries;
   public void addCountryToList(Country country){countries.add(country);

   }
   public void displayCountriesList(){
       System.out.println("Here are counties to choose " + countries);
   }
}

