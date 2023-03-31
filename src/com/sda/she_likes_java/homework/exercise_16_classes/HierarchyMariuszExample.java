package com.sda.she_likes_java.homework.exercise_16_classes;

public class HierarchyMariuszExample {
    public static void main(String[] args) {
        Animal animalinfo = new Animal("Bentlijs",2, "Labrador");
        Owner owner = new Owner("Inese","Buda","Dog",animalinfo);
        System.out.println("Here is all info about owner and her animal:" + owner);
    }
}
