package com.sda.she_likes_java.homework.exercise18a;

public class Airport {
    public static void main(String[] args) {
        Airplane airplaneToFaro = new Airplane("Riga-Faro", 12, 8, 8, 20, 20, 5);

        airplaneToFaro.takeOff();
        airplaneToFaro.flyTo();
        airplaneToFaro.land();


    }


}
