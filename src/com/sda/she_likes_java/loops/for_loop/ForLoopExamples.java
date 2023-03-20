package com.sda.she_likes_java.loops.for_loop;

public class ForLoopExamples {
    public static void main(String[] args) {

        for (
             int number = 0; //initilization part - executes only once
             number < 100;//condition of the loop
             number++ // executed aslast insruction in current iteration
        ){
            System.out.println("Number value is:" + number);
        }
        //the same loop, but with while
        int number = 0;
        while (number <100){
            System.out.println("Number value is:" + number);
            number++; //if this line put above sout, then numbers starts from 1 to 100
        }
    }
}
