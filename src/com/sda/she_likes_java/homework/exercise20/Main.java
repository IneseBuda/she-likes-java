package com.sda.she_likes_java.homework.exercise20;

public class Main {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        ferrari.driveFast();
        ferrari.looksExpensive();
        System.out.println("\n");
        System.out.println("Safe cast for Mazda and Toyota specific methods");

        Car anotherMazda = new Mazda();
        Mazda castedFromCars = (Mazda) anotherMazda;
        castedFromCars.drivesNotSoFast();
        castedFromCars.looksNotSoExpensive();
        System.out.println("\n");

        Car anotherToyota = new Toyota();
        Toyota castedAlsoFromCars = (Toyota) anotherToyota;
        castedAlsoFromCars.drivesSlowly();
        castedAlsoFromCars.looksCheep();

        System.out.println("\n");
        CarUtils carUtils = new CarUtils();
        carUtils.safeCast(anotherMazda);
        carUtils.safeCast(anotherToyota);

    }
}
