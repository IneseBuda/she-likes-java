package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPersonsMain {

    public static void main(String[] args) {
        SortedPerson olaf = new SortedPerson("Olaf", 22);
        SortedPerson inese = new SortedPerson("Inese", 12);
        SortedPerson zorro = new SortedPerson("Zorro", 12);
        SortedPerson zorra = new SortedPerson("Zorra", 12);
        List<SortedPerson> persons = new ArrayList<>();
        persons.add(olaf);
        persons.add(inese);
        persons.add(zorro);
        persons.add(zorro);
        persons.add(zorra);

        Collections.sort(persons);

        System.out.println("After sorting " + persons);
        //if returns -1 that means: olaf should be first, inese
        //if returns 1 that means: inese first, olfs after
        // System.out.println("Olaf.compareTo(gustav): "+ olaf.compareTo(inese));
        //System.out.println("Inese.compareTo(zorro): "+ inese.compareTo(zorro));

        Comparator<SortedPerson> reverseAgeOrder = new AgedReversedOrderOfSortedPersons();
        Collections.sort(persons, reverseAgeOrder);
        // Collections.sort(persons,new AgedReversedOrderOfSortedPersons());//this is the same as above
        System.out.println("Reversed order based on age: " + persons);

        List<String> names = new ArrayList<>();//comparable method
        names.add("Ramune");
        names.add("Lina");
        names.add("Alma");
        names.add("Karolina");
        Collections.sort(names);
        System.out.println("Sorted manes: " + names);

        Collections.sort(persons, new LexicalOrderForSortedPerson());
        System.out.println("Persons sorted by name: " + persons);

        Collections.sort(persons, new ReversedLexicalOrderForSortedPerson());
        System.out.println("Persons reversed sorted by name: " + persons);
    }
}

