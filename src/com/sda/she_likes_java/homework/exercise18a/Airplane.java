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

    public void setFlyTo(String flyTo) {
        this.flyTo = flyTo;
    }

    public void setxCoordinates(int xCoordinates) {
        this.xCoordinates = xCoordinates;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public void setzFlyTo(int zFlyTo) {
        this.zFlyTo = zFlyTo;
    }

    public void setStayInHangar(int stayInHangar) {
        this.stayInHangar = stayInHangar;
    }

    public void setTakeOff(int takeOff) {
        this.takeOff = takeOff;
        if (takeOff > 9) {
            System.out.println("Plane to Faro take off!");
        }
    }

    public void setLand(int land) {
        this.land = land;
    }

    public String getFlyTo() {
        return flyTo;
    }

    public int getxCoordinates() {
        return xCoordinates;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public int getzFlyTo() {
        return zFlyTo;
    }

    public int getStayInHangar() {
        return stayInHangar;
    }

    public int getTakeOff() {
        return takeOff;
    }

    public int getLand() {
        return land;
    }

    public void takeOff() {
        if (takeOff > 9) {
            System.out.println("Plane to Faro take off!");
        } else if (stayInHangar > 4) {
            System.out.println("Plane stay in hangar!");
        }
    }



        public void FlyTo() {
            if (zFlyTo == xCoordinates + yCoordinate) {
                System.out.println("Plane on the air and fly to Faro");
            } else {
                System.out.println("Plane flies to another destination!");
            }
        }



        public void land () {
            if (land > 19) {
                System.out.println("Plane start to land!");

            } else if (stayInHangar > 4) {
                System.out.println("Plane stay in hangar!");

            }

        }


    }

