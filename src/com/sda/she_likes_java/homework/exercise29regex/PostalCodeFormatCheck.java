package com.sda.she_likes_java.homework.exercise29regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalCodeFormatCheck {
    public void postalCodeFormatCheck(String usersPostalCode) throws Exception{
        String regex = "^[A-Z]{2}(?:-[0-9]{4})?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(usersPostalCode);
        boolean matchFound = matcher.matches();
        if(matchFound){
            System.out.println("Match found, correct format");
        }else {
            System.out.println("Match not found");
            throw new Exception("Wrong format, please use format AB-1234");

        }

    }
}
