package com.sda.she_likes_java.homework.exercise_17a_random;

public class Book {
    private  String author;
    private String title;
    private int yearOfPublication;
    private static int numberOfBooks;

    public Book(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        numberOfBooks++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    public static int getNumberOfBooks() {
        return numberOfBooks;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
