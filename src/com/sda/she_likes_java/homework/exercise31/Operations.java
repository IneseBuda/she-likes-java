package com.sda.she_likes_java.homework.exercise31;
@FunctionalInterface
public interface Operations {
    int addition();

    default int subtract(){
        return 0;
    };
    default int multiply(){
        return 0;
    };
    default int divide(){
        return 0;
    };
}
