package com.sda.she_likes_java.polymorphism;

public class Cat extends Animal {
   //if method the same but behavior is different than override
    @Override
    public void makeSounds(){
        System.out.println("Miau");

    }

public void sleep(){
    System.out.println("Cat is sleeping");
}
}
