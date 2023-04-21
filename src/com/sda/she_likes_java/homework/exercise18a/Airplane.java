package com.sda.she_likes_java.homework.exercise18a;

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
 class Airplane {
    private String flyTo;
    private int xCoordinates;
    private int yCoordinate;
    private int zFlyTo;
    private int stayInHangar;

    private int takeOff;
    private int land;

    public Airplane(String flyTo, int xCoordinates, int yCoordinate, int takeOff, int land, int zFlyTo, int stayInHangar) {
        this.flyTo = flyTo;
        this.xCoordinates = xCoordinates;
        this.yCoordinate = yCoordinate;
        this.takeOff = takeOff;
        this.land = land;
        this.zFlyTo = zFlyTo;
        this.stayInHangar = stayInHangar;
    }


    public void takeOff() {

        if (zFlyTo == xCoordinates + yCoordinate && takeOff ==10 && land == 20 && stayInHangar>=10) {
            System.out.println("Plane to Faro take off!");
        } else if (stayInHangar < 10) {
            System.out.println("Plane stay in hangar!");

        }

    }


    public void flyTo() {
        if (zFlyTo == xCoordinates + yCoordinate && takeOff ==10 && land == 20 && stayInHangar >=10) {
            System.out.println("Plane on the air and fly to Faro");
        } else {
            System.out.println("Plane stay in hangar!");
        }
    }

    public void land() {
        if (land == 20 && takeOff==10 && zFlyTo == xCoordinates + yCoordinate&& stayInHangar >=10) {
            System.out.println("Plane start to land!");



    } else {
        System.out.println("Plane stay in hangar!");


        }
    }


        @Override
        public String toString () {
            return "Airplane{" +
                    "flyTo='" + flyTo + '\'' +
                    ", xCoordinates=" + xCoordinates +
                    ", yCoordinate=" + yCoordinate +
                    ", zFlyTo=" + zFlyTo +
                    ", stayInHangar=" + stayInHangar +
                    ", takeOff=" + takeOff +
                    ", land=" + land +
                    '}';
        }
    }




