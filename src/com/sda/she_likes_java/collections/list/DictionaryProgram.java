package com.sda.she_likes_java.collections.list;

import java.io.Console;
import java.util.Scanner;

public class DictionaryProgram {
    public static void main(String[] args) {


   //MyGreatDictionary englishPolishDictionary = MyDictionaries.createEnglishPolishDictionary();
        System.out.println("Which dictionary you would like to use?");
        System.out.println("Type 1 for Englist-Latvian ");
        System.out.println("Type 2 for English-Polish");
       // Console console = System.console();
      //  String userChoice = console.readLine();

        Scanner inputReader = new Scanner(System.in);
        String userChoice = inputReader.next();
MyGreatDictionary currentDictionary;
        if (userChoice.equals("1")) {

currentDictionary =MyDictionaries.createEnglishLatvianDictionary();
            System.out.println("Let's use English -Latvian dictionary");
           // MyGreatDictionary englishLatvianDictionary = MyDictionaries.createEnglishPolishDictionary();
          //  System.out.println("Let's use English -Polish dictionary");
         //   System.out.println("Provide word to translate: ");
         //   String wordFromTheUser = inputReader.next();
          //  englishLatvianDictionary.translateFromSourceLanguageToDestiny(wordFromTheUser);

        }else if(userChoice.equals("2")){
            currentDictionary =MyDictionaries.createEnglishPolishDictionary();

            System.out.println("Let's use English -Polish dictionary");


        }else {
            System.out.println("I don't know what you mean");
            return;
        }
        System.out.println("Provide word to translate: ");
        String wordFromTheUser = inputReader.next();
        currentDictionary.translateFromSourceLanguageToDestiny(wordFromTheUser);
    }
}
