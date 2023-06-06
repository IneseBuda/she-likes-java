package com.sda.she_likes_java.homework.exercise31scaner;

public class Calculator implements Operations {
    @Override
    public int addition(int first1, int second2) {

        int add = (first1 + second2);
        return add;
    }

    @Override
    public int subtract(int first, int second) {

        int sub = (first - second);

        return sub;
    }

    @Override
    public int multiply(int first, int second) {

        int mult = (first * second);
        return mult;
    }

    @Override
    public int divide(int first, int second) {

        int div = first / second;
        return div;
    }
}


