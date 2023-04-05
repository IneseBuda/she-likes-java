package com.sda.she_likes_java.homework.exercise_17_book_lending;

public class Library {
    public static void main(String[] args) {
        Book bookFirst = new Book("J.K. Rowling","Harry Potter",1997);
        System.out.println("First book info: " + bookFirst);
        System.out.println("Current number of books: " + Book.getNumberOfBook());

        Book bookSecond = new Book("Charlotte Bronte", "Jane Eyre",1847);
        System.out.println("Second book info: " + bookSecond);
        System.out.println("Current number of book " + Book.getNumberOfBook());

        Book bookThird = new Book("Antoine de Saint-Exupéry", "The Little Prince", 1943);
        System.out.println("Third book info: " + bookThird);
        System.out.println("Current number of book " + Book.getNumberOfBook());
    }
}
