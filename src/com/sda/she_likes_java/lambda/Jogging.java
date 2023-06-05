package com.sda.she_likes_java.lambda;

//Classes fom java.lang are imported always
//import java.lang
// API - Application programming interface
//contract - what to do, but not how
@FunctionalInterface//to protect programmer from accidental refactoring

public interface Jogging {

    public abstract void run();

    //simple/default implementation
   default void walk(){};// can not put more methods, because lambda don't know to witch method to apply
//default void methods needs to be override in classes not with lambda
    default void drink(String drink){}

}
