package com.sda.she_likes_java.homework.exercise18;


/*
Exercise 18.
Create an Airplane class that provides the following operations:
- takeOff
- land
- flyTo(int xCoordinates, int yCoordinates)
- retrieve the current state of the aeroplane (flies/waits in hangar)
When implementing, remember that:
- the aircraft must be in the air to land
- you cannot take off if you are already in the air
- use variables to store internal state
- check the use of your class in the main method
- have fun
 */
public class Airplane {
    private String flyToFaro;
    private String onTheAir;
    private String inHangar;
    private int xCoordinates;
    private int yCoordinates;

    public Airplane(String flyToFaro, String onTheAir, String inHangar, int xCoordinates, int yCoordinates) {
        this.flyToFaro = flyToFaro;
        this.onTheAir = onTheAir;
        this.inHangar = inHangar;
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }



    public void planeTakeOff() {

    }

    public void thePlaneLands() {

    }

    public void thePlaneOnTheAir() {

    }
    public void flyToFaro(){

    }

    @Override
    public String toString() {
        return "Airplane{" +
                "flyToFaro='" + flyToFaro + '\'' +
                ", onTheAir='" + onTheAir + '\'' +
                ", inHangar='" + inHangar + '\'' +
                ", xCoordinates=" + xCoordinates +
                ", yCoordinates=" + yCoordinates +
                '}';
    }
}
