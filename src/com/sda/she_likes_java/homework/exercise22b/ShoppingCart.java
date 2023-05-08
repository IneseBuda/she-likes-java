package com.sda.she_likes_java.homework.exercise22b;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addProductToBasket(Item product) {
        items.add(product);
    }

    public void displayProducts() {
        System.out.println("Items in shopping cart: " + items);
    }

    public double calculateTotalBasketValue() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPriceInUSD() * 1.21;
        }
       // for (int i = 0; i < items.size(); i++) {
       //     sum += items.get(i).getPriceInUSD()*1.21;
      //  }

        return sum;
    }
}

