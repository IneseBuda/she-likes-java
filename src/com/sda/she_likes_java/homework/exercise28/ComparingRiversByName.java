package com.sda.she_likes_java.homework.exercise28;

import java.util.Comparator;

public class ComparingRiversByName implements Comparator<RiversOfLatvia> {

    @Override
    public int compare(RiversOfLatvia o1, RiversOfLatvia o2) {
        String name1 = o1.getNameOfRiver();
        String name2 = o2.getNameOfRiver();
        return name1.compareTo(name2);
    }
}
