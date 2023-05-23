package com.sda.she_likes_java.homework.exercise29;

public class PostalCodeMain {

    public static void main(String[] args) {
        CheckingPostalCode checkingPostalCode;
        checkingPostalCode= new CheckingPostalCode(null);

    try {
       checkingPostalCode.checkPostalCode();
        System.out.println("You have correct postal code");
    }catch (PostalCodeException e){
        System.out.println("Incorrect postal code" +e);
    }catch (Exception e){
        System.out.println("Generic");
    }
    }
}
