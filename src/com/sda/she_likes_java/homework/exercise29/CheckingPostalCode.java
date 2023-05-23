package com.sda.she_likes_java.homework.exercise29;
/*
Exercise 29
Create a class to check the postal code format with one method: void checkPostalCode(String postalCode).
The method returns nothing if the code format is correct.
Otherwise it throws a PostalCodeException exception.
 */
public class CheckingPostalCode {

    private final PostalCode correctPostalCode;

    public CheckingPostalCode(PostalCode correctPostalCode) {
        this.correctPostalCode = correctPostalCode;
    }
    public void checkPostalCode()throws Exception{
        boolean correctPostalCode = false;
        if(correctPostalCode){
            return;
        }
        throw new PostalCodeException("Postal code is incorrect");
    }

    @Override
    public String toString() {
        return "CheckingPostalCode{" +
                "correctPostalCode=" + correctPostalCode +
                '}';
    }
}
