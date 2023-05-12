package com.sda.she_likes_java.homework.exercise24;

import java.util.Objects;

public class EnglishWords {
    private String englishWord;
    private String translationOfWordToLv;

    public EnglishWords(String englishWord, String translationOfWordToLv) {
        this.englishWord = englishWord;
        this.translationOfWordToLv = translationOfWordToLv;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getTranslationOfWordToLv() {
        return translationOfWordToLv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnglishWords that = (EnglishWords) o;
        return Objects.equals(englishWord, that.englishWord) && Objects.equals(translationOfWordToLv, that.translationOfWordToLv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(englishWord, translationOfWordToLv);
    }

    @Override
    public String toString() {
        return "EnglishWords{" +
                "englishWord='" + englishWord + '\'' +
                ", translationOfWordToLv='" + translationOfWordToLv + '\'' +
                '}';
    }


}

