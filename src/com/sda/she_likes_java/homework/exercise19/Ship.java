package com.sda.she_likes_java.homework.exercise19;

public class Ship extends Vehicle {
    @Override
    public void move(){
        System.out.println("The ship sails on the sea");
    }

    @Override
    public void stay() {
        System.out.println("The ship stays in the port");
    }
}
