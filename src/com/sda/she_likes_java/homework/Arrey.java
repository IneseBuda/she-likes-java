package com.sda.she_likes_java.homework;

public class Arrey {
    //Exercise 13
    //Create an int array with 100 elements
    //Initialise each element with a value 3 times greater than the current index
    //e.g.
    //tab[0] = 3 * 0
    //tab[10] = 3 * 10.
    public static void main(String[] args) {
        int[] myFond = new int[100];

        for (int index = 0; index < myFond.length; index++){
            myFond[index] = index;
        }
        for (int index = 0; index < myFond.length; index++){
            System.out.println("My fond eur:" + index + "\t is: " + (index * 3) + "eur");
        }
    }
}
