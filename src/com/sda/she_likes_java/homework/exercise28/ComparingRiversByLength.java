package com.sda.she_likes_java.homework.exercise28;

import java.util.Comparator;

public class ComparingRiversByLength implements Comparator<RiversOfLatvia> {

    @Override
    public int compare(RiversOfLatvia o1, RiversOfLatvia o2) {
        int firstRiverLength = o1.getLengthOfRiver();
        int secondRiverLength = o2.getLengthOfRiver();
        return firstRiverLength-secondRiverLength;
    }
}
