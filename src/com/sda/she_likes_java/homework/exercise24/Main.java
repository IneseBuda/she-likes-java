package com.sda.she_likes_java.homework.exercise24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.sda.she_likes_java.homework.exercise24.EnglishLatvianlDictionary.translateClientWord;
import static com.sda.she_likes_java.homework.exercise24.EnglishLatvianlDictionary.translateTheWordToLV;

public class Main {

    public static void main(String[] args) {
        List<EnglishWords> englishWords = List.of(
                new EnglishWords("Dog", "Suns"),
                new EnglishWords("Cat", "Kaķis"),
                new EnglishWords("MIlk", "Piens")
        );

        List<EnglishWords> translateWord = translateTheWordToLV(englishWords, "Dog");
        System.out.println("Translation of word: " + translateWord);
       translateWord = translateTheWordToLV(englishWords, "Sky");
        System.out.println("We have not such word in dictionary: " + translateWord);


        String clientEnglishWord;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Write an english word: ");
        clientEnglishWord = inputReader.nextLine();
        List<EnglishWords> translateClientWord = translateClientWord(englishWords, clientEnglishWord);
        System.out.println("Translation of word: " +translateClientWord);

    }
}

