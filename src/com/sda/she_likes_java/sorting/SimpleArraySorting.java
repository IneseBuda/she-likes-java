package com.sda.she_likes_java.sorting;

import java.util.Arrays;

public class SimpleArraySorting {
    public static void main(String[] args) {
        int[] numbers = new int[4];

        int[] numbers2 = {1,2,5,4,-1};
        Object arrayObject = numbers2;// in Java everything exept primitive is object
        System.out.println(numbers2.length);

        //Arrays - contains useful methods for arrays
        //Collections - contains useful methods for collections

        Arrays.sort(numbers2);
        System.out.println("number2: "+ numbers2);//not good one
        System.out.println(Arrays.toString(numbers2));



    }


}
