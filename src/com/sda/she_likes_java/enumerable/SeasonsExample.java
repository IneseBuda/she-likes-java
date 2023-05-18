package com.sda.she_likes_java.enumerable;

import java.util.List;

public class SeasonsExample {
    public static void main(String[] args) {
        //Person me = new Person();
        //Person me = new Person();
        //Person me = new Person(); here we create every time new instances
        Seasons myFavoriteOne = Seasons.SUMMER;//here we don't to create new Season
        System.out.println("Average temp during summer is: "+ myFavoriteOne.getAverageTemp());
        System.out.println("Summer's activity" + myFavoriteOne.getActivity());
        myFavoriteOne.setActivity("swimming");
        System.out.println("Summer's activity " + myFavoriteOne.getActivity());

    Seasons autumn = Seasons.AUTUMN;
        System.out.println("Average temp during autumn is: "+ autumn.getAverageTemp());
        System.out.println("summer" + myFavoriteOne);

        List<Seasons> seasonList = List.of(
                Seasons.WINTER,
                Seasons.AUTUMN
        );

        System.out.println(seasonList);
    }
}
