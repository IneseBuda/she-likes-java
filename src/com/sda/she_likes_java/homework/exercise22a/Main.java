package com.sda.she_likes_java.homework.exercise22a;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShoppingCart myShoppingcart = new ShoppingCart();
        myShoppingcart.addingToBasket();
        List<Item> items = new ArrayList<>();
        items.add(new Item("Fanta", 2.00));
        items.add(new Item("Sprite", 2.00));
        items.add(new Item("Fazer", 3.20));
        System.out.println(List.of(items));

        System.out.println("Total for chosen items: ");
        System.out.println((items.get(0).getPrice()+items.get(1).getPrice()+items.get(2).getPrice()));
        List<Item> moreItems = new ArrayList<>();
        moreItems.add(new Item("Laima", 3.50));
        moreItems.add(new Item("Milk", 1.0));
        System.out.println("More items are added to basket");
        myShoppingcart.displayItems();
        System.out.println(List.of(items, moreItems));
        myShoppingcart.calculateTotal();
        System.out.println((items.get(0).getPrice()+items.get(1).getPrice()+items.get(2).getPrice()+moreItems.get(0).getPrice()+moreItems.get(1).getPrice()));



    }
}
