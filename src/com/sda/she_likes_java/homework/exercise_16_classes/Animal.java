package com.sda.she_likes_java.homework.exercise_16_classes;

public class Animal {
   private String name;
  private   int age;
   private String breed;

    public Animal() {
    }

    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }




    public static void main(String[] args) {
        Animal animalinfo=new Animal("Bentlijs",2,"Labrador");
        System.out.println("Animal info:"+animalinfo);

    }
}
