package com.sda.she_likes_java.arrays;

import java.util.Random;

public class EnglishSchoolGrades {
    /* opening part of multiline coment
Exercise 13
    Create an int array with 100 elements
    Initialise each element with a value 3 times greater than the current index
    e.g.
            tab[0] = 3 * 0
    tab[10] = 3 * 10.

     */   //closing part of multiline coment



    public static void main(String[] args) {
        //Create an int array with 100 elements
        int[] myGradesOnEnglishClass = new int[10000];//1000 is a length

        Random gradeGenerator = new Random();
//initialization grades with some random scores
        for (int index = 0; index < myGradesOnEnglishClass.length; index++) {
            myGradesOnEnglishClass[index] = gradeGenerator.nextInt(7);//if we do not want 0, then 1+ gradeGenerator.nexInt(6)
        }

        for (int index = 0; index < myGradesOnEnglishClass.length; index++) {
            System.out.println("my grade on index nr: " + index + " is: " + myGradesOnEnglishClass[index]);
        }//only second for do output, reading code
    }
}



