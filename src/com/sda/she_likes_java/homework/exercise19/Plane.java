package com.sda.she_likes_java.homework.exercise19;

public class Plane extends Vehicle{
    @Override
    public void move() {
        super.move();
        System.out.println("The plane flies in the air");
    }
    @Override
    public void stay(){
        System.out.println("The plane is staying in hangar");
    }
}
