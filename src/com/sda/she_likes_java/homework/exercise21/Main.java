package com.sda.she_likes_java.homework.exercise21;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.move();

        Vehicle airplane = new Airplane();
        airplane.move();
        Airplane myAirplane = new Airplane();
        myAirplane.move();
        ((Flying) airplane).flying();

        Vehicle ship = new Ship();
        ship.move();
        ((Floating) ship).floating();

        Vehicle submarine = new Submarine();
        submarine.move();
        ((Diving)submarine).diving();

        Casting.safeCasting(new Airplane());
        Casting.safeCasting(new Ship());
        Casting.safeCasting(new Submarine());
    }
}
