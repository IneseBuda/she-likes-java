package com.sda.she_likes_java.homework.exercise_16_classes;
/*
Exercise 16
Create a hierarchy of classes:
use a separate package: exercise_16
new Owner class with private fields
First name
Surname,
Animal
class Animal containing the fields
first name
age
breed
Use private variables and create get/set methods
Create a toString() method for each class.
Create a main method and a sample class hierarchy.
 */
public class Owner {

  private   String name;
   private String surname;
   private String animal;
  private Animal animalinfo;

    public Owner() {
    }

    public Owner(String name, String surname, String animal, Animal animalinfo) {
        this.name = name;
        this.surname = surname;
        this.animal = animal;
        this.animalinfo = animalinfo;
    }


    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", animal='" + animal + '\'' +
                ", animalinfo=" + animalinfo +
                '}';
    }

    public static void main (String[] args) {
        Owner owner=new Owner("Inese","Buda","Dog",null);
        System.out.println("The owner info:"+owner);
    }

}
