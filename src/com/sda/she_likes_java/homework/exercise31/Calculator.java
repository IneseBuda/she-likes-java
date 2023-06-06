package com.sda.she_likes_java.homework.exercise31;

public class Calculator implements Operations {

   @Override
 public int addition() {
  int first=8;
     int second=8;
        int add;
        add = (first+second);
        return 0;
    }

    @Override
    public int subtract() {
        int first=8;
        int second=8;
        int sub;
        sub = (first-second);
        return sub;
    }

    @Override
    public int multiply() {
        int first=8;
        int second=8;
        int mult;
        mult = (first*second);
        return mult;
    }

    @Override
    public int divide() {
        int first=8;
        int second=8;
        int div;
        div = (first/second);
        return div;
    }
}
