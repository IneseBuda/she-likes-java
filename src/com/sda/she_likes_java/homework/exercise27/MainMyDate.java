package com.sda.she_likes_java.homework.exercise27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMyDate {

    public static void main(String[] args) {
        MyDate weddingDate = new MyDate(29,12,2001);
        MyDate firstChildBirth = new MyDate(19,12,2002);
        MyDate secondChildBirth = new MyDate(2,11,2007);
        MyDate firstDateWithHusband = new MyDate(25,8,1995);
        List<MyDate> myDates = new ArrayList<>();
        myDates.add(weddingDate);
        myDates.add(firstChildBirth);
        myDates.add(secondChildBirth);
        myDates.add(firstDateWithHusband);

        Collections.sort(myDates);
        System.out.println("My events sorted by year: " + myDates);


    }
}
