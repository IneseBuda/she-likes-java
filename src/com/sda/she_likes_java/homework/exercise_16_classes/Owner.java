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


    public Animal getAnimalinfo() {
        return animalinfo;
    }

    public void setAnimalinfo(Animal animalinfo) {
        this.animalinfo = animalinfo;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
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

       Animal animalinfo=new Animal("Bentlijs",2,"Labrador");
        Owner owner=new Owner("Inese","Buda","Dog",animalinfo);
        System.out.println("The owner info:"+owner);
    }




    }

