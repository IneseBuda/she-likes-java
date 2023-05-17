package com.sda.she_likes_java.enumerable;

public enum ProgrammersStates {
    GOD_mODE("I can do everything"),
    EXHAUSTED("Bang the wall"),
    NORMAL("yeah it's just life");

    String description;

    ProgrammersStates(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
