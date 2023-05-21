package com.sda.she_likes_java.homework.exercise28;

import java.util.Comparator;
import java.util.Objects;

/*
Exercise 28.
Create a class implementing the Comparator interface to sort objects of type String based on their length.
Prepare the Main class and perform sorting on the examples.
 */
public class RiversOfLatvia  {

    private String nameOfRiver;
    private int lengthOfRiver;

    public RiversOfLatvia(String nameOfRiver, int lengthOfRiver) {
        this.nameOfRiver = nameOfRiver;
        this.lengthOfRiver = lengthOfRiver;
    }

    public String getNameOfRiver() {
        return nameOfRiver;
    }

    public int getLengthOfRiver() {
        return lengthOfRiver;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiversOfLatvia that = (RiversOfLatvia) o;
        return lengthOfRiver == that.lengthOfRiver && Objects.equals(nameOfRiver, that.nameOfRiver);
    }



    @Override
    public String toString() {
        return "RiversOfLatvia{" +
                "nameOfRiver='" + nameOfRiver + '\'' +
                ", lengthOfRiver=" + lengthOfRiver +
                '}';
    }



    }


