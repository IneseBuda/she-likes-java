package com.sda.she_likes_java.homework;

/*
Exercise 14
Create class with name Address
Put next variables inside it:
- country,
- city,
- street
- postal code
Use proper data types.
Try to create to create two different addresses objects and init them with some values.
 */
public class TwoAddress {
    public static void main(String[] args) {
        System.out.println("Your address:");
        // int streetNumber = 12;
        //int flatNumber = 6;
        //String street = "Kr.Baqrona";
        //String city = "Sigulda";
        //String country = "Latvia";

        Address first = new Address();
        first.street = "Barona street";
        first.streetNumber = 12;
        first.flatNumber = 6;
        first.city = "Sigulda";
        first.country = "Latvia";
        first.regionLetter = "LV";
        first.postalCode = 2150;

        System.out.println(" %s %d - %d, %s, %s, %s - %d ".formatted(first.street, first.streetNumber,
                first.flatNumber, first.city, first.country, first.regionLetter, first.postalCode));
        System.out.println("Your additional address:");

        Address addition = new Address();
        addition.street = "Brocēnu street";
        addition.streetNumber = 2;
        addition.flatNumber = 4;
        addition.city = "Saldus";
        addition.country = "Latvia";
        addition.regionLetter = "LV";
        addition.postalCode = 4321;

        System.out.println(" %s %d - %d, %s, %s, %s - %d ".formatted(addition.street, addition.streetNumber,
                addition.flatNumber, addition.city, addition.country, addition.regionLetter, addition.postalCode));


    }
}
