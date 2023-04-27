package com.sda.she_likes_java.homework.exercise18;

public class Airport {
    public static void main(String[] args) {
        Airplane airplaneToFaro = new Airplane("Riga.Faro", 10, 20, 9, 12, 8);

        airplaneToFaro.setaInHagar(9);
        airplaneToFaro.setxTakeOff(10);
        airplaneToFaro.setxCoordinates(12);
        airplaneToFaro.setyCoordinates(8);
        airplaneToFaro.setzFlyTo(12, 8);
        airplaneToFaro.setyPlaneLands(20);

        airplaneToFaro.inHangar();
        airplaneToFaro.planeTakeOff();
        airplaneToFaro.zFlyTo();
        airplaneToFaro.thePlaneLands();

    }
}
