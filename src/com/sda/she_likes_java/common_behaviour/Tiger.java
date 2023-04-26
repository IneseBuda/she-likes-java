package com.sda.she_likes_java.common_behaviour;

public class Tiger extends Animal implements Swimable {
    @Override
    public void go() {
        System.out.println("go() from Tiger");
    }


    @Override
    public void swim() {
        System.out.println("Tiger are great swimmer");
    }
}
