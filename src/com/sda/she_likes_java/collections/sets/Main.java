package com.sda.she_likes_java.collections.sets;

import com.sda.she_likes_java.collections.Trousers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sets are designed for storing unique things/items");

        Set<Trousers> uniqueTrousers = new HashSet<>();
        uniqueTrousers.add(new Trousers("jeans", "big stars"));
        uniqueTrousers.add(new Trousers("jeans", "big stars"));
        uniqueTrousers.add(new Trousers("jeans", "big stars"));
        uniqueTrousers.add(new Trousers("jeans", "big stars"));

        System.out.println("size of this set is:" +uniqueTrousers.size());
        System.out.println("set of my trousers: " + uniqueTrousers);

        List<Trousers> trousersList2 = List.of(
                new Trousers("jeans","big star"),
                new Trousers("jeans","big star"),
                new Trousers("jeans","big star"),
                new Trousers("jeans","big star"));

        Set<Trousers> anotherSet = new HashSet<>(trousersList2);
        System.out.println("Lets check if my list had some duplicates");
        System.out.println(trousersList2.size()==anotherSet.size());

//set is for checking is there some duplicates
    }
}
