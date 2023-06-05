package com.sda.she_likes_java.lambda;

public class LambdaExercises {
    public static void main(String[] args) {
      Jogging slowMan = new SlowRunner();
      Jogging fastRunner = new FastRunner();
      justRun(slowMan);
      justRun(fastRunner);

      //anonymous classes- till java 7
        Jogging middleOne = new Jogging() {
            @Override
            public void run() {
                System.out.println("I'm middle runner");
            }
        };
        justRun(middleOne);
        middleOne.run();


        Jogging firstLambda = ()-> {};
        //the same as above override
        Jogging middleOneRunner = ()-> {
            System.out.println("Run from lambda");
        };
        middleOneRunner.run();

        justRun(()->{
            System.out.println("In place");
        });
    }

    public static void justRun(Jogging runner){
        runner.run();
    }
}
