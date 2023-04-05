package com.sda.she_likes_java.homework.exercise_17_book_lending;

public class Book {
    private static int numberOfBook;
    private String author;
    private String title;
    private int yearOfPublication;

    private static int random;
    private static int randomNumber1;
    private static int randomNumber2;
    private static int randomNumber3;

    public Book(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        numberOfBook++;
        random++;
        randomNumber1++;
        randomNumber2++;
        randomNumber3++;


    }

    public static int getRandomNumber1() {
        return randomNumber1;
    }

    public static int getRandomNumber2() {
        return randomNumber2;
    }

    public static int getRandomNumber3() {
        return randomNumber3;
    }

    public Book(int randomBooks) {
        this.random = randomBooks;
    }

    public static int getRandom() {
        return random;
    }

    public static void setRandomNumber1(int randomNumber1) {
        Book.randomNumber1 = randomNumber1;
    }

    public static void setRandomNumber2(int randomNumber2) {
        Book.randomNumber2 = randomNumber2;
    }

    public static void setRandomNumber3(int randomNumber3) {
        Book.randomNumber3 = randomNumber3;
    }

    public void setRandom(int random) {
        this.random = random;
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
