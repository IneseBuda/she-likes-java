package com.sda.she_likes_java.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        Cat myCat = new Cat();
        Animal secondCat = new Cat();
        secondCat.makeSounds();
        Animal dog = new Dog();
        dog.makeSounds();
        callAnimal(someAnimal);
        callAnimal(myCat);
        callAnimal(dog);

        callAnimal(new Elephant());
        Object anotherCat = new Cat();
       // anotherCat.makeSound();
        Animal animalCat = new Cat();
       // animalCat.sleep();
        Cat thirdCat = new Cat();
    }

    public static void callAnimal(Animal animal) {
        animal.makeSounds();
    }

    public static void callAnimal(Dog animal) {
        animal.makeSounds();
    }
}
