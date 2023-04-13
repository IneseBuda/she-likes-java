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
       int makeCopies=numberGenerator.nextInt(30);
        System.out.println("Random copies" + makeCopies);
       // bookCopies = makeCopies.nextInt();

        for (int i = 0; i < 5; i++) {
            makeBookCopies();
           // makeCopies = bookCopies.nextInt(30);
           // bookCopies = makeCopies.nextInt(30);

        }

        System.out.println("Get book number" + Book.getNumberOfBooks());
    }

    private static void makeBookCopies() {
    }


}


       // Book makeBookCopies = new Book("x", "y", 111);




