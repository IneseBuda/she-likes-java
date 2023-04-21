package com.sda.she_likes_java.homework.exercise18;

public class Airport {
    public static void main(String[] args) {
        Airplane airplaneToFaro = new Airplane("Riga.Faro", 10, 1, 11, 0, 5, 5);

        System.out.println("My airplane from Riga to Faro" + airplaneToFaro);


        while (true) {


            int xTakeOff = airplaneToFaro.getxTakeOff();
            if (xTakeOff < 10) {
                airplaneToFaro.planeTakeOff();

                int zOnTheAir = airplaneToFaro.getzOntheAir();

                if (zOnTheAir > 10) {

                    airplaneToFaro.thePlaneOnTheAir();
                }


                int yPlaneLands;
                yPlaneLands= airplaneToFaro.getyPlaneLands();
                int xCoordinates;
                        xCoordinates=airplaneToFaro.getxCoordinates();
                int yCoordinates;
                        yCoordinates= airplaneToFaro.getyCoordinates();

                if (xCoordinates==yCoordinates) {

                    airplaneToFaro.thePlaneLands();

                }
                int aInHagar = airplaneToFaro.getaInHnagar();
                if (aInHagar < 1) {

                    System.out.println("Plane is in Hangar");

                }
                break;
            }
        }


    }
}
