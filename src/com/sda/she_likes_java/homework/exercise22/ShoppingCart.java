package com.sda.she_likes_java.homework.exercise22;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

/*
Create a shopping cart class.
Add as a field an items variable of type List<Item> - to store products.
Item is also the class to be created.
It is to contain the following fields:
- product name
- product price.
The shopping cart class should provide the following operations:
- add product to basket
- displaying products in the shopping cart
- calculation of the total basket value.
Create a Main class and check the operations of your classes.
 */
public class ShoppingCart {
    public static void main(String[] args) {
        List<SoftDrink>softDrinks = new ArrayList<>();
       softDrinks.add(new SoftDrink("Fanta",2.00));
       softDrinks.add(new SoftDrink("Sprite", 2.00));

        List<Chocolate>chocolates = new ArrayList<>();
        chocolates.add(new Chocolate("Fazer", 3.25));
        chocolates.add(new Chocolate("Laima",3.50));

//Chocolate chocolate = new Chocolate("Fazer",3.25);


        List<Milk>milks = new ArrayList<>();
       milks.add(new Milk("Baltais",1.40));
       milks.add(new Milk("Rimi",1.29));

        System.out.println("Products in shopping cart: ");
        System.out.println("Soft drinks: "+ softDrinks.get(1) );
        System.out.println("Chocolates:" + chocolates.get(0));
        System.out.println("Milks:" + milks.get(0));

        System.out.println("Total value:" + (softDrinks.get(1).getPrice()+ chocolates.get(0).getPrice()+milks.get(0).getPrice()));

    }



}
