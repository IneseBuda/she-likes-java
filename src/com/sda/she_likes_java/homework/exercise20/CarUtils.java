package com.sda.she_likes_java.homework.exercise20;

public class CarUtils {

    // public void whatCarItIs(Car car){
    //   if(car != null){
    //      car.carDrive();
    // }
    // }
    public static void safeCast(Car maybeMazdaOrToyota) {
        if (maybeMazdaOrToyota instanceof Mazda) {
            System.out.println("It is Mazda");
            ((Mazda) maybeMazdaOrToyota).drivesNotSoFast();
            ((Mazda) maybeMazdaOrToyota).looksNotSoExpensive();
        }

        if (maybeMazdaOrToyota instanceof Toyota) {
            System.out.println("It is Toyota");
            ((Toyota) maybeMazdaOrToyota).drivesSlowly();
            ((Toyota) maybeMazdaOrToyota).looksCheep();
        }
        if (maybeMazdaOrToyota instanceof Ferrari) {
            System.out.println("Ferrari is not Mazda and not Toyota as well! ");
        }else{
            System.out.println("Different type");
        }

    }

public void differentType (Car ferrari){

        System.out.println("It is ferrari");
}

}
