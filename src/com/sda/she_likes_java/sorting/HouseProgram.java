package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HouseProgram {
    public static void main(String[] args) {
        List<House> myHouse = new ArrayList<>();
        myHouse.add(new House(10,2,5,"Spain"));
        myHouse.add(new House(5,2,3,"Latvia"));
        myHouse.add(new House(4,2,2,"Estonia"));
        myHouse.add(new House(2,1,1,"Poland"));

        Collections.sort(myHouse);
        System.out.println("Sorted by natural way: " + myHouse);

        ComparingHouseByNumberOfFloors comparingHouseByNumberOfFloors = new ComparingHouseByNumberOfFloors();
        HouseComparingByCountry houseComparingByCountry = new HouseComparingByCountry();
        Collections.sort(myHouse,
                comparingHouseByNumberOfFloors.
                        reversed()
                        .thenComparing(houseComparingByCountry));

        System.out.println("Sorted with comparator :" + myHouse);




    }
}
