package com.sda.she_likes_java.functions;

public class FunctionsFirstExample {
    //It's function
    public static void main(String[] args) {
        // it's a piece of the code which I can call many times
        // function features
        // has name - just before opening bracke like "main"
       // has parameters - inside brackets: String[] args
       // has return value - type name before name of teh function e.g.void
   // voids means no return
        // we call function by its name
        printMyName();
        System.out.println();
        System.out.println("After call...");
        System.out.println();
        printMyName();
    }

    public static void printMyName() {
        int numberOfTimes = 10;
        while (numberOfTimes >0) {
            System.out.println("Hi, I'm Inese");
            numberOfTimes--;
        }
    }


}
