package com.sda.she_likes_java.collections.list;

import java.util.ArrayList;
import java.util.List;

public class MyGreatDictionary {
    private List<WordsBilingual>dictionary;

    public MyGreatDictionary(){
        dictionary = new ArrayList<>();
    }
    public void fillWithWordsBilingual(List<WordsBilingual>listOfWord){
        dictionary.addAll(listOfWord);
    }
    public void translateFromSourceLanguageToDestiny(String sourceWord){
//iterate the list
        for (WordsBilingual currentWordsPair: dictionary) {
            //compare sourceWord with sourceLanguage from currant item
           if (currentWordsPair.getSourceLanguage().equals(sourceWord)){
               String translated = currentWordsPair.getDestinyLanguage();
               //if we found word just finish provide nice message from user
                System.out.println("Translation of[%s] is [%s]".formatted(sourceWord,translated));
           return;
            }
        }
        //if no solution we need to provide sorry message from user
        System.out.println("Sorry, no translation of [%s]".formatted((sourceWord)));



    }
}

