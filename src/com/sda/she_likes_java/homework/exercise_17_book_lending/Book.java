package com.sda.she_likes_java.homework.exercise_17_book_lending;

public class Book {
    private static int numberOfBook;
    private String author;
    private String title;
    private int yearOfPublication;
    private int randomNumber;

    public Book(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        numberOfBook++;
    }

    public Book(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public static int getNumberOfBook() {
        return numberOfBook;
    }

    public static void setNumberOfBook(int numberOfBook) {
        Book.numberOfBook = numberOfBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }



}
