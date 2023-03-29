package com.sda.she_likes_java.homework.exercise_16_classes;

public class HierarchyofClasses {


    public static void main(String[] args) {
        Owner ownerinfo = new Owner();
        Animal animalInfo = new Animal();

        animalInfo.setAge(2);
        animalInfo.setName("Bentlijs");
        animalInfo.setBreed("Labrador");


        ownerinfo.setName("Inese");
        ownerinfo.setSurname("Buda");
        ownerinfo.setAnimal("Dog");
        ownerinfo.setAnimalinfo(animalInfo);

        System.out.println("Here all info: " + ownerinfo);


    }
}
