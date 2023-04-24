package com.sda.she_likes_java.virtual_methods;

public class HumanLife {

    public void tellMeWhoYouAre(Human human) {
        if (human != null) {
            human.whoYouAre();
        }
    }
    public void tryToCastHumanToMan(Human maybeWomanOrMan) {

        if (maybeWomanOrMan instanceof Man){
            System.out.println("I am a man");
            ((Man) maybeWomanOrMan).learnToCleanHouse();// it is the same as below
        }
        //casting / down casting
        //works for the references
     //   (
      //          (Man) maybeWomanOrMan
      //  ).learnToCleanHouse();


        if (maybeWomanOrMan instanceof Woman){
            System.out.println("I am woman");
            ((Woman)maybeWomanOrMan).learnJava(); //can not cast both man and woman at the  same time
        }

    }
}
