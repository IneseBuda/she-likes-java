package com.sda.she_likes_java.homework;
/*
Exercise 15.
Create a Parent class containing the following variables:
- first name
- surname
- address - (use the class Address)
- firstChild (use class Person)
- secondChild (use class Person)
 */
public class Parent {
    String name;
    String surname;



    public static void main(String[] args) {
        Parent mummy = new Parent();
        mummy.name = "Inese";
        mummy.surname = "Buda";
        Parent father = new Parent();
        father.name = "Rudolfs";
        father.surname = "Buda";
        Address first = new Address();
        first.street = "Kr.Barona";
        first.streetNumber = 12;
        first.flatNumber = 6;
        first.city = "Sigulda";
        first.country = "Latvia";
        first.regionLetter = "LV";
        first.postalCode = 2150;
        Person firstChild = new Person();
        firstChild.name = "Annija";
        Person secondChild = new Person();
        secondChild.name = "Roberts";
        System.out.println();


    }
}