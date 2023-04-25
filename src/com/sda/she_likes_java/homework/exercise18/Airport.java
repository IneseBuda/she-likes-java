package com.sda.she_likes_java.homework.exercise18;

public class Airport {
    public static void main(String[] args) {
        Airplane airplaneToFaro = new Airplane("Riga.Faro", 10, 20, 9);

        airplaneToFaro.setaInHagar(9);
        airplaneToFaro.setxTakeOff(10);
        airplaneToFaro.setzFlyTo(true);
        airplaneToFaro.setyPlaneLands(20);

        airplaneToFaro.inHangar();
        airplaneToFaro.planeTakeOff();
        airplaneToFaro.zFlyTo(12,8);
        airplaneToFaro.thePlaneLands();

    }
}
