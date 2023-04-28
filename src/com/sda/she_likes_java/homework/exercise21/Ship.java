package com.sda.she_likes_java.homework.exercise21;

public class Ship extends Vehicle implements Floating{
    @Override
    public void move() {
        System.out.println("move() from ship");
    }

    @Override
    public void floating() {
        System.out.println("Ship is floating");

    }
}
