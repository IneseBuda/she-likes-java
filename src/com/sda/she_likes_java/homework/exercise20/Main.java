package com.sda.she_likes_java.homework.exercise20;

public class Main {
    public static void main(String[] args) {

        Car anotherMazda = new Mazda();
        Car anotherToyota = new Toyota();
        Car ferrari = new Ferrari();

        System.out.println("Safe cast for Mazda and Toyota specific methods");

        CarUtils carUtils = new CarUtils();
        carUtils.safeCast(anotherMazda);
        carUtils.safeCast(anotherToyota);
        carUtils.differentType(ferrari);
        BMW bmw = new BMW();//if we call direct than we can get method from bmw direct
        bmw.speedUp();

        Car bwm = new BMW();//samainīju bmw burtus, lai strādātu
        CarUtils.safeCast(bwm);
        System.out.println("\n");



    }
}
