package com.sda.she_likes_java.enumerable;

public class DeveloperStatesexample {

    public static void main(String[] args) {
        System.out.println("Hey, let's start the day");
        ProgrammersStates myState = ProgrammersStates.NORMAL;
        System.out.println("I am in " + myState + "state");
        System.out.println("I feel: " + myState.getDescription());

        System.out.println("I have got new task. Great!");
        myState = ProgrammersStates.GOD_mODE;
        System.out.println("I am in " + myState + "state");
        System.out.println("I feel: " + myState.getDescription());

        System.out.println("fter a while i am exausted - stupid task");
        myState = ProgrammersStates.EXHAUSTED;
        System.out.println("I am in " + myState + "state");
        System.out.println("I feel: " + myState.getDescription());

        myState = null;
        System.out.println("rebooting system:");

        String one = "one-value";
        String two = one;

        if(one==two){
            System.out.println("The same object pointed by obe and two");
        }

        compareEnums(ProgrammersStates.GOD_mODE);
        System.out.println("Enum methods");
        System.out.println("name " +ProgrammersStates.GOD_mODE.name());
        System.out.println("ordinal: " + ProgrammersStates.GOD_mODE.ordinal());
        ProgrammersStates[] allStates = ProgrammersStates.values();
        System.out.println("Should be Normal: "+ allStates[2]);
        System.out.println("How many of moods: "+ allStates.length);

    }


    public static void compareEnums(ProgrammersStates someState){
        if(someState==ProgrammersStates.GOD_mODE){
            System.out.println("God mode enabled:)");
        }
    }
}
