package com.sda.she_likes_java.collections.maps;



import com.sda.she_likes_java.collections.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        //Wrappers: Long,Integer for collections
        int a=0;
        Integer aInteger = null;
       // List<int>integers; Not allowed
        List<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(1);
        intNumbers.add(2);
        intNumbers.add(null);


        long grade = -1;
        Long longGrade = 2L;//here we can use numbers and value null
        longGrade = null;//if no grades we use Long
        //2+2=4
        //2+null it is no number, but value
        String name = null;
        List<Long> numbers;//we need this for storing values in side the list

        // String will be student's name
        // List<Long> - student's grades
        Map<String,List<Long>> studentGrades = new HashMap<>();
   String john = "John";
   List<Long>johnsGrades = new ArrayList<>();
   johnsGrades.add(5L);
   johnsGrades.add(1L);

   List<Long>anotherListOfGrades = new ArrayList<>();
   anotherListOfGrades.add(3L);

   studentGrades.put(john,johnsGrades);
        System.out.println("after adding John to map: " + studentGrades);
   studentGrades.put(john,anotherListOfGrades);
        System.out.println("after reassigning John inside map: " + studentGrades);

        Person me = new Person("Inese", "b");
        me = new Person("Inese", "a");//we are looseing acces to previous
   // me="karolina";

        Map<String, String> namesAndSurnames = new HashMap<>();
        namesAndSurnames.put("Ramune", "LTU");

        System.out.println("Ramune's surname: " + namesAndSurnames.get("Ramune"));

    }
}
