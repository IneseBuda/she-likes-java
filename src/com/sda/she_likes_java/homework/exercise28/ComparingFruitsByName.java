package com.sda.she_likes_java.homework.exercise28;

import java.util.Comparator;

public class ComparingFruitsByName implements Comparator<Fruits> {
    @Override
    public int compare(Fruits o1, Fruits o2) {
       String firstFruitName = o1.getName();
       String secondFruitName = o2.getName();
       return firstFruitName.compareTo(secondFruitName);
    }
}
