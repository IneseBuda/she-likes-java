package com.sda.she_likes_java.arrays;

import java.util.Random;

public class EnglishSchoolGrades {
    public static void main(String[] args) {
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



