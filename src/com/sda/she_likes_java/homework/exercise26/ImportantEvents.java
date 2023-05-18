package com.sda.she_likes_java.homework.exercise26;
/*Exercise 26
Create an enumeration class named ImportantEvents.
The class should contain the following fields:
- Date of the event
- Description of the event.
Create at least 3 instances of the class to symbolise your important events.
Create the class Main and in it:
- call the values() method of your class
- write out the contents of the created array (dates and description)*/
public enum ImportantEvents {
    CHRISTMAS("24.december", "giving gifts"),
    EASTER("16.april", "painting eggs"),
    MIDSUMMER("23.june", "burning firewood");

    String date;
    String description;

    ImportantEvents(String date, String description) {
        this.date = date;
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
