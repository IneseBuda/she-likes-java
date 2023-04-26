package com.sda.she_likes_java.common_behaviour.wrong_approach;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
      //  bird.fly();

        Animal tiger = new Tiger();
        tiger.go();

        Bird parrot = new Parrot();
        Bird ostrich = new Ostrich();

        Flyable superman = new Superman();
        Flyable flyableParrot = new Parrot();

      //  Swimable tiger2 = tiger; can not because Animal do not swim
        //we can write:
        Swimable tiger2 =(Swimable)tiger;//or
        Swimable swimableTiger = new Tiger();
        Swimable swimableSuperman = (Swimable) superman;

        Superman superSuperMan = new Superman();
        superSuperMan.fly();
        superSuperMan.swim();
        Flyable superFly = superSuperMan;
        superFly.fly();
        Swimable superSwim = superSuperMan;
        superSwim.swim();


        //Tiger assignment
        Tiger newTiger = new Tiger();
        newTiger.go();
        newTiger.swim();
        Animal animalTiger = new Tiger();
        animalTiger.go();
        Swimable swimableTiger2 = new Tiger();
        swimableTiger2.swim();
        Object objectTiger = new Tiger();//  can not call go or swim - they are not visibly here

    }
}
