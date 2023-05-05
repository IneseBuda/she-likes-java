package com.sda.she_likes_java.homework.exercise22;

public class SoftDrink {
    private String name;
    private double price;

    public SoftDrink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CocaCola{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
