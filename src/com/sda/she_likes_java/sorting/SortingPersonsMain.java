package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingPersonsMain {

    public static void main(String[] args) {
        SortedPerson olaf = new SortedPerson("Olaf", 22);
        SortedPerson inese = new SortedPerson("Inese", 12);
        SortedPerson zorro = new SortedPerson("Zorro", 12);
        List<SortedPerson> persons = new ArrayList<>();
        persons.add(olaf);
        persons.add(inese);
        persons.add(zorro);
        persons.add(zorro);
        persons.add(zorro);

        Collections.sort(persons);

        System.out.println("After sorting "+ persons);
        //if returns -1 that means: olaf should be first, inese
        //if returns 1 that means: inese first, olfs after
       // System.out.println("Olaf.compareTo(gustav): "+ olaf.compareTo(inese));
        //System.out.println("Inese.compareTo(zorro): "+ inese.compareTo(zorro));


    }
}

