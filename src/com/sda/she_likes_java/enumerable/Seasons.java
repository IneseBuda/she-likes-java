package com.sda.she_likes_java.enumerable;

import java.util.List;

//enum is class with restricted number of instances
public enum Seasons {

    WINTER(-5, "skiing"),
    SUMMER(25, "swimming"),
    AUTUMN(5, "running"),
    SPRING(10, "walking");

    private  int averageTemp;
    private String activity;

    private Seasons(int averageTemp, String activity) {
        this.averageTemp = averageTemp;
        this.activity = activity;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }


}
