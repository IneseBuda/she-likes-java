package com.sda.she_likes_java.strings;
//immutable - something which can not change
public class ImmutableString {

    public static void main(String[] args) {
        String name = "Inese ";

       name= name.concat("Buda ");//+ is schortcut for concat method call
       name = name.concat("she is 40 ");
       System.out.println("My name is " + name);

       //better to use builder
        StringBuilder nameWithBuilder = new StringBuilder("Inese ");
        nameWithBuilder.append("Buda ");
        nameWithBuilder.append("She is 40 ");
        System.out.println("Name with builder: " + nameWithBuilder);

    //Here is 7 strings, bad for memory, go from the left to the right
        String some = "Alise" + "is" + "10" + "years";
    //"Alise is"+ "10" + "years"
        //Alise is 10" + "years"
        //Alise is 10 years
        String alise = "Alise";


//This is one string
        StringBuilder someString = new StringBuilder();
        someString.append("Alise ");
        someString.append("is ");
        someString.append("10");
        someString.append("years");

    }
}
