package com.sda.she_likes_java.strings;

public class StringsExample {

    public static void main(String[] args) {
        String name = "Inese";
        String surname = "Buda";
        int age = 44;
        //Hi, I'm Inese Buda. Iam 44 old


        System.out.println("Hi, I am " + name +" "+ surname+". I am " + age + " years old.");

        //String format %s %s
        //%s String wildcard
        //%d number wildcard
        System.out.println(String.format("Hi, I'm %s %s. I am %d old.", name, surname, age));
        System.out.println("Hi, I'm %s %s. I am %d old.".formatted(name,surname,age));
    }
}
