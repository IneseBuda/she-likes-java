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

    private int xTakeOff;
    private int yPlaneLands;
    private int zFlyTo;
    private int aInHangar;
    private int xCoordinates;
    private int yCoordinates;


    public Airplane(String flyToFaro, int xTakeOff, int yPlaneLands, int aInHnagar, int xCoordinates, int yCoordinates) {
        this.flyToFaro = flyToFaro;

        this.xTakeOff = xTakeOff;
        this.yPlaneLands = yPlaneLands;

        this.aInHangar = aInHnagar;
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }

    public void setFlyToFaro(String flyToFaro) {
        this.flyToFaro = flyToFaro;
    }

    public void setxTakeOff(int xTakeOff) {
        this.xTakeOff = xTakeOff;
        if (xTakeOff == 10) {
            System.out.println("Plane to Faro take off!");
        }
    }

    public void setzFlyTo(int xCoordinates,int yCoordinates) {
        this.zFlyTo = xCoordinates&yCoordinates;

        if (xCoordinates == 12 && yCoordinates == 8) {

            System.out.println("Plane on the air and fly to Faro");
        }
    }

    public void setyPlaneLands(int yPlaneLands) {
        this.yPlaneLands = yPlaneLands;
        if (yPlaneLands == 20) {
            System.out.println("Plane start to land!");
        }
    }


    public void setaInHagar(int aInHagar) {
        this.aInHangar = aInHangar;
        if (aInHagar == 9) {
            System.out.println("Plane stay in the hangar");
        }
    }

    public void setxCoordinates(int xCoordinates) {
        this.xCoordinates = xCoordinates;
        if (xCoordinates == 12) {
        }
    }

    public void setyCoordinates(int yCoordinates) {
        this.yCoordinates = yCoordinates;
        if (yCoordinates == 8) {

        }
    }

    public void planeTakeOff() {

    }

    public void inHangar() {

    }

    public void zFlyTo() {

    }

    public void thePlaneLands() {

    }


    @Override
    public String toString() {
        return "Airplane{" +
                "flyToFaro='" + flyToFaro + '\'' +

                ", xTakeOff=" + xTakeOff +
                ", yPlaneLands=" + yPlaneLands +
                ", zFlyTo=" + zFlyTo +
                ", aInHnagar=" + aInHangar +

                '}';
    }

}
