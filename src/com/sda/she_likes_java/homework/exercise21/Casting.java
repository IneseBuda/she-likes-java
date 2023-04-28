package com.sda.she_likes_java.homework.exercise21;

public class Casting {
    public static void safeCasting(Vehicle vehicle){
        if (vehicle instanceof Airplane){
            System.out.println("This is airplane");
        ((Airplane) vehicle).flying();

        }else if (vehicle instanceof Ship){
            System.out.println("This is ship");
             ((Ship)vehicle).floating();
        }else {
            System.out.println("Different type of vehicle");
        }
    }
}
