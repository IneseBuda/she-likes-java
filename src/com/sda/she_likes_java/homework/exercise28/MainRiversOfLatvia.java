package com.sda.she_likes_java.homework.exercise28;

import com.sda.she_likes_java.sorting.CollectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainRiversOfLatvia {
    public static void main(String[] args) {
        List<RiversOfLatvia>rivers= new ArrayList<>();
        rivers.add(new RiversOfLatvia("Gauja",452));
        rivers.add(new RiversOfLatvia("Daugava",1020));
        rivers.add(new RiversOfLatvia("Lielupe",346));
        rivers.add(new RiversOfLatvia("Abava", 346));


       ComparingRiversByLength comparingRiversByLength = new ComparingRiversByLength();
       ComparingRiversByName comparingRiversByName = new ComparingRiversByName();
       Collections.sort(rivers, comparingRiversByLength.thenComparing(comparingRiversByName));

        System.out.println("Sorted with comparator: " + rivers);
        System.out.println("Sorted my lenght of name");




    }
}
