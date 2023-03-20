package com.sda.she_likes_java.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int a = 1,b=1,c = 1;
        int d = 1;
        int e = 3;
        //create an array (set) of 5 values
        //for in type default value is :0
        //indexes starts at 0 till 4
        //arrays size is defined 5
        int[] numbers = new int[5];
        System.out.println("first element is:" + numbers[0]);
        System.out.println("last element is always array size - 1");
       // System.out.println("is it correct to use number[5}?" + numbers[5]);
        System.out.println("Is this line printed?");

        System.out.println("trying to init array");
        numbers[0] = 10;
        numbers[1] = 15;
        numbers[2] = 150;
        numbers[3] = 225;
        numbers[4] = 25;
        System.out.println("number [4] is:" + numbers[4]);

    }
}
