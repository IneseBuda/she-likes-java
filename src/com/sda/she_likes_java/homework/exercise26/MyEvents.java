package com.sda.she_likes_java.homework.exercise26;

public class MyEvents {
    public static void main(String[] args) {
        System.out.println("Here are my main events:");
        ImportantEvents[] myEvents = ImportantEvents.values();
        System.out.println("My favorite event is "+ myEvents[0]);
        ImportantEvents myEvent = ImportantEvents.CHRISTMAS;
        System.out.println("It is on "+ myEvent.getDate());
        System.out.println("In this event we are: "+ myEvent.getDescription());

        System.out.println("Much of work is in "+ myEvents[1]);
        myEvent = ImportantEvents.EASTER;
        System.out.println("It is on "+ myEvent.getDate());
        System.out.println("In this event we are: "+ myEvent.getDescription());

        System.out.println("Much of relax is on "+ myEvents[2]);
        myEvent = ImportantEvents.MIDSUMMER;
        System.out.println("It is on "+ myEvent.getDate());
        System.out.println("In this event we are: "+ myEvent.getDescription());


    }

}
