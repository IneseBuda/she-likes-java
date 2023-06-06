package com.sda.she_likes_java.homework.exercise31scaner;
@FunctionalInterface
public interface Operations {
    int addition(int first1, int second2);

    default int subtract(int first, int second) {
        return 0;
    }


    default int multiply(int first, int second){
        return 0;
    };
    default int divide(int first, int second){
        return 0;
    };
}
