package com.sda.she_likes_java.homework.exercise24;

import java.util.ArrayList;
import java.util.List;


/*
Create a class English-Lithuanian dictionary.
Requirements:
- the class has a translate method that takes an English word as an argument;
- add support for 10 words;
- if the user asks for an unsupported word - add a message about the lack of support.
Create a class Main and check the functionality of your class.
 */
public class EnglishLatvianlDictionary {

    public static List<EnglishWords> translateTheWordToLV(List<EnglishWords> englishWords, String translateWord) {
        List<EnglishWords> result = new ArrayList<>();

        for (EnglishWords englishWord : englishWords) {
            if (englishWord.getEnglishWord().equals(translateWord)) {
                result.add(englishWord);

                } else {
                  System.out.println("Sorry, we can not find the word");
            }
        }return result;


    }

    public static List<EnglishWords> translateClientWord(List<EnglishWords> englishWords, String clientEnglishWord) {
        List<EnglishWords> result = new ArrayList<>();

        for (EnglishWords englishWord : englishWords) {
            if (englishWord.getEnglishWord().equals(clientEnglishWord)) {
                result.add(englishWord);
            } else {
                System.out.println("Sorry, we can not find the word");
            }


        }return result;
    }
}




