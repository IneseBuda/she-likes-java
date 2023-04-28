package com.sda.she_likes_java.homework.exercise21;

public class Main {
    public static void main(String[] args) {
Vehicle vehicle = new Vehicle();
vehicle.move();

Airplane airplane = new Airplane();
airplane.move();
airplane.flying();

Ship ship = new Ship();
ship.move();
ship.floating();

Submarine submarine = new Submarine();
submarine.move();
submarine.diving();

Casting.safeCasting(new Airplane());
Casting.safeCasting(new Ship());
Casting.safeCasting(new Submarine());
    }
}
