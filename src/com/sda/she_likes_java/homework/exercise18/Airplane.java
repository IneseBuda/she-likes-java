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
    private Boolean zFlyTo;
    private int aInHangar;



    public Airplane(String flyToFaro,  int xTakeOff, int yPlaneLands,  int aInHnagar) {
        this.flyToFaro = flyToFaro;

        this.xTakeOff = xTakeOff;
        this.yPlaneLands = yPlaneLands;

        this.aInHangar = aInHnagar;

    }

    public void setFlyToFaro(String flyToFaro) {
        this.flyToFaro = flyToFaro;
    }

    public void setxTakeOff(int xTakeOff) {
        this.xTakeOff = xTakeOff;
        if(xTakeOff==10){
            System.out.println("Plane to Faro take off!");
        }
    }

    public void setzFlyTo(Boolean zFlyTo) {
        this.zFlyTo = zFlyTo;
        zFlyTo(12,8);
        if (zFlyTo=true) {

            System.out.println("Plane on the air and fly to Faro");
        }
    }

    public void setyPlaneLands(int yPlaneLands) {
        this.yPlaneLands = yPlaneLands;
        if (yPlaneLands==20){
            System.out.println("Plane start to land!");
        }
    }



    public void setaInHagar(int aInHagar) {
        this.aInHangar = aInHangar;
        if(aInHagar==9){
            System.out.println("Plane stay in the hangar");
        }
    }





    public void planeTakeOff() {



    }

public void inHangar(){

}
    public void zFlyTo(int xCoordinates, int yCoordinates) {
        this.zFlyTo = zFlyTo;
        if (zFlyTo=true){
            System.out.println("Plane on the air and fly to Faro");
        }

    }

    public void thePlaneLands(){

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
