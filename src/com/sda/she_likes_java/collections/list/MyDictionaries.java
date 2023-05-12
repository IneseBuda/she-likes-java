package com.sda.she_likes_java.collections.list;

import java.util.List;

public class MyDictionaries {
    //create english-latvian dictionary
    public static MyGreatDictionary createEnglishLatvianDictionary() {
        List<WordsBilingual> list = List.of(
                new WordsBilingual("Milk", "Piens")
        );
        MyGreatDictionary englishLatvianDictionary = new MyGreatDictionary();
        englishLatvianDictionary.fillWithWordsBilingual(list);
        return englishLatvianDictionary;
    }

    //create english-polish dictionary
    public static MyGreatDictionary createEnglishPolishDictionary() {
        List<WordsBilingual> list = List.of(
                new WordsBilingual("House", "Dom")
        );
        MyGreatDictionary englishPolishDictionary = new MyGreatDictionary();
        englishPolishDictionary.fillWithWordsBilingual(list);

        return englishPolishDictionary;
    }
}
