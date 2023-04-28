package com.sda.she_likes_java.homework.exercise21;

public class Airplane extends Vehicle implements Flying{

    @Override
    public void move() {
        System.out.println("move() from airplane");
    }

    @Override
    public void flying() {
        System.out.println("Airplane is flying");
    }
}
