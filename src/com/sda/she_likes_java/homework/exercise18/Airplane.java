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
    private int zOntheAir;
    private int aInHagar;
    private int xCoordinates;
    private int yCoordinates;

    public Airplane(String flyToFaro,  int xTakeOff, int yPlaneLands, int zOntheAir, int aInHnagar, int xCoordinates, int yCoordinates) {
        this.flyToFaro = flyToFaro;

        this.xTakeOff = xTakeOff;
        this.yPlaneLands = yPlaneLands;
        this.zOntheAir = zOntheAir;
        this.aInHagar = aInHnagar;
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
    }

    public void setFlyToFaro(String flyToFaro) {
        this.flyToFaro = flyToFaro;
    }

    public void setxTakeOff(int xTakeOff) {
        this.xTakeOff = xTakeOff;
    }

    public void setyPlaneLands(int yPlaneLands) {
        this.yPlaneLands = yPlaneLands;
    }

    public void setzOntheAir(int zOntheAir) {
        this.zOntheAir = zOntheAir;
    }

    public void setaInHagar(int aInHagar) {
        this.aInHagar = aInHagar;
    }

    public void setxCoordinates(int xCoordinates) {
        this.xCoordinates = xCoordinates;
    }

    public void setyCoordinates(int yCoordinates) {
        this.yCoordinates = yCoordinates;
    }

    public String getFlyToFaro() {
        return flyToFaro;
    }



    public int getxTakeOff() {
        return xTakeOff;
    }

    public int getyPlaneLands() {
        return yPlaneLands;
    }

    public int getzOntheAir() {
        return zOntheAir;
    }

    public int getaInHnagar() {
        return aInHagar;
    }

    public int getxCoordinates() {
        return xCoordinates;
    }

    public int getyCoordinates() {
        return yCoordinates;
    }

    public void planeTakeOff() {

        System.out.println("Plane take off from airport");

    }

    public void thePlaneLands() {
        //yPlaneLands--;
        System.out.println("Plane are landing");
    }

    public void thePlaneOnTheAir() {
        System.out.println("Plane in the air to Faro");
    }

    public void flyToFaro() {
        xCoordinates = 5;
        yCoordinates = 5;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "flyToFaro='" + flyToFaro + '\'' +

                ", xTakeOff=" + xTakeOff +
                ", yPlaneLands=" + yPlaneLands +
                ", zOntheAir=" + zOntheAir +
                ", aInHnagar=" + aInHagar +
                ", xCoordinates=" + xCoordinates +
                ", yCoordinates=" + yCoordinates +
                '}';
    }
}
