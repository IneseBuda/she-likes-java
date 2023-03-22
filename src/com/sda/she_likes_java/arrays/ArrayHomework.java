package com.sda.she_likes_java.arrays;

public class ArrayHomework {
/*
Exercise 13
Create an int array with 100 elements
Initialise each element with a value 3 times greater than the current index
e.g.
tab[0] = 3 * 0
tab[10] = 3 * 10.
 */
    public static void main(String[] args) {
//create an int array with 100 element
        int[]numbers = new int[100];
//initialization phase
        //first index is 0
        //last index is number.length  minus 1

        for ( int i =0; i<numbers.length;i++ ){
            numbers[i] = 3 * i;
        }

        //read data
for ( int i =0; i<numbers.length;i++ ){
    System.out.println("number[" + i + "] =" + numbers[i]);
}
    }
}
