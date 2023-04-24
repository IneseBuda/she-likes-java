package com.sda.she_likes_java.homework.exercise19;

public class Main {

    public static void main(String[] args) {
        Vehicle someVehicle = new Vehicle();
        Ship myShip = new Ship();
        Plane myPlane = new Plane();

        callVehicle(someVehicle);
        System.out.println("\n");

        callVehicle(myPlane);
        System.out.println("\n");

        callVehicle(myShip);
        System.out.println("\n");

        myShip.move();
        System.out.println("\n");

        myPlane.move();
        System.out.println("\n");

        someVehicle.move();
    }

    private static void callVehicle(Vehicle someVehicle) {
        someVehicle.move();
    }
}
