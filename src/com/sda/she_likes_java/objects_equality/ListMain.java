package com.sda.she_likes_java.objects_equality;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
       List<Object> personObjects = new ArrayList<>();
        List personList = new ArrayList();//never use without parametres

        Person me = new Person("inese", "buda", 18);
        Person me2 = new Person("ilze", "zile", 20);
        Person otherOne = new Person("Lote", "lase", 7);

        personList.add(me);
        personList.add(me2);
        personList.add(otherOne);
        personList.add(new Car("Blue"));


        System.out.println(personList);
        System.out.println("Try to get person out of ist");
        personList.get(1);//we are getting second person because in java counts from 0

        System.out.println("Person from list:" + personList.get(1));
        Person personFromList = (Person) personList.get(1);//casting
        Object fromPosition0 = personList.get(0);
        System.out.println("age of the person fromPosition0" + ((Person) fromPosition0).getAge());


        //this is better way to get from the list
        List<Person> betterPersonList = new ArrayList<>();
        betterPersonList.add(me);
        Person fromTheList = betterPersonList.get(0);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pink"));
     System.out.println("Car colour is:" + cars.get(0).colour);
       // cars.add(me);


    }
}
