package com.sda.she_likes_java.homework.exercise_17a_random;

import java.util.Random;

public class Library {
    public static void main(String[] args) {
        Book bookFirst = new Book("J.K. Rowling", "Harry Potter", 1997);
        System.out.println("First book info: " + bookFirst);
        Book bookSecond = new Book("Charlotte Bronte", "Jane Eyre", 1847);
        System.out.println("Second book info: " + bookSecond);
        Book bookThird = new Book("Antoine de Saint-Exupéry", "The Little Prince", 1943);
        System.out.println("Third book info: " + bookThird);

        Random numberGenerator = new Random();
        int makeBookCopies = numberGenerator.nextInt(5);
        System.out.println("Random copies " + makeBookCopies);


        for (int i = 0; i <= makeBookCopies; i++) {
            makeBookCopies();


        }

        System.out.println("Get book number " + (Book.getNumberOfBooks() + makeBookCopies));
    }

    private static void makeBookCopies() {
        new Book("x", "y", 111);
        new Book("a", "b", 222);
        new Book("z", "c", 333);
    }


}







