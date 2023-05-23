package com.sda.she_likes_java.homework.exercise28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitMain {
    public static void main(String[] args) {
        List<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("Orange"));
        fruits.add(new Fruits("Strawberry"));
        fruits.add(new Fruits("Lemon"));
        fruits.add(new Fruits("Apple"));

        Collections.sort(fruits,new ComparingFruitsByName());

        System.out.println("Sorting by String length" + fruits);

//ComparingFruitsByName comparingFruitsByName = new ComparingFruitsByName();
//Collections.sort(fruits,comparingFruitsByName);

       // System.out.println("Sorted by first letter: " + fruits);

       // fruits.sort(Comparator.comparingInt(Fruits::length));
      //  System.out.println("Sorting by Sting length");
       // System.out.println(fruits);
    }


}
