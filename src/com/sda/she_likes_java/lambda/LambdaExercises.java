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

        Walker johnny = () -> {};
        johnny.walk();

        Adder longVersion = (int first, int second) -> {
            return first+second;
        };
        //just names of parameters without types
        Adder shorterVersion = (first, second) -> {
            return first+second;
        };
        Adder compactVersion = (first, second) -> first+second;
       int sum = compactVersion.addTwoNumbers(1,2);
        System.out.println("Result " + sum);
Adder compactVersionWithManyInstruction = (first, second) -> {
    System.out.println("Performing operation ..");
    return first+second;
};
compactVersionWithManyInstruction.addTwoNumbers(1,4);
        shorterVersion.addTwoNumbers(2,4);


    }

    public static void justRun(Jogging runner){
        runner.run();
    }
}
