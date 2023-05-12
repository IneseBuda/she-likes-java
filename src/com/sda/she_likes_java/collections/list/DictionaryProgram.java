package com.sda.she_likes_java.collections.list;

public class DictionaryProgram {
    public static void main(String[] args) {
        MyGreatDictionary englishLatvianDictionary = MyDictionaries.createEnglishLatvianDictionary();
        englishLatvianDictionary.translateFromSourceLanguageToDestiny("dog");
        englishLatvianDictionary.translateFromSourceLanguageToDestiny("house");
    }
}
