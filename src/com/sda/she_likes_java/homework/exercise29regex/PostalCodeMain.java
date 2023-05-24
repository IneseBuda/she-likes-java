package com.sda.she_likes_java.homework.exercise29regex;

import java.util.Scanner;

public class PostalCodeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your postal code");
   String usersPostalCode = scanner.next();

   PostalCodeFormatCheck postalCodeFormatCheck = new PostalCodeFormatCheck();
   try {
       postalCodeFormatCheck.postalCodeFormatCheck(usersPostalCode);
   }catch (Exception e){
       System.out.println(e.getMessage());
   }

    }
}
