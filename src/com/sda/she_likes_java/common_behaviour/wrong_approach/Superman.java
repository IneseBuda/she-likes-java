package com.sda.she_likes_java.common_behaviour.wrong_approach;

public class Superman implements Flyable, Swimable{
    @Override
    public void fly() {
        System.out.println("Superman is flying");
    }

    @Override
    public void swim() {
        System.out.println("Superman is super swimmer");
    }
}
