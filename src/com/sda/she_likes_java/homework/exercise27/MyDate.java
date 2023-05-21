package com.sda.she_likes_java.homework.exercise27;
/*
Exercise 27
Create a MyDate class containing three fields:
- year - of type int
- month - of type int
- day - of type int
Implement the Comparable interface for your class.
Create a Main class, add four MyDate objects to the list and perform sorting.
 */


import java.util.Objects;

public class MyDate implements Comparable<MyDate>{
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day && month == myDate.month && year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        return year - o.getYear();

    }


}
