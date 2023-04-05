package com.sda.she_likes_java.homework.exercise_17_book_lending;

import java.util.Random;

public class Library {
    public static void main(String[] args) {


        Book bookFirst = new Book("J.K. Rowling", "Harry Potter", 1997);
        System.out.println("First book info: " + bookFirst);
        System.out.println("Current number of books: " + Book.getNumberOfBook());


        //System.out.println("Book random number is: " + bookFirst.getRandomNumber());


        Book bookSecond = new Book("Charlotte Bronte", "Jane Eyre", 1847);
        System.out.println("Second book info: " + bookSecond);
        System.out.println("Current number of book " + Book.getNumberOfBook());

        Book bookThird = new Book("Antoine de Saint-Exupéry", "The Little Prince", 1943);
        System.out.println("Third book info: " + bookThird);
        System.out.println("Current number of book " + Book.getNumberOfBook());


        for (int i=0; i<10; i--) {
            randomNumberOfBooks();
        }

        Random randomNumber = new Random();

        int bookFirstNumber = randomNumber.nextInt(10);
        int bookSecondNumber = randomNumber.nextInt(10);
        int bookThirdNumber = randomNumber.nextInt(10);

        System.out.println("Random numbers of bookFirst " + bookFirstNumber);

        System.out.println("Random numbers of bookSecond " + bookSecondNumber);


        System.out.println("Random numbers of bookThird " + bookThirdNumber);
        System.out.println("First created number of book " + Book.getNumberOfBook());
        System.out.println("Here the number of all created books:");
        System.out.println(Book.getNumberOfBook() + bookFirstNumber + bookSecondNumber + bookThirdNumber);

    }
        private static void randomNumberOfBooks () {
        }
    }





            //  makeSomeRandomBooks();
            //  randomNumberOfBooks();






        //private static void randomNumberOfBooks () {


        //  private static void makeSomeRandomBooks() {


        //   new Book("J.K. Rowling", "Harry Potter", 1997);
        //  System.out.println(+bookFirstNumber);
        //  new Book("Charlotte Bronte", "Jane Eyre", 1847);
        //  System.out.println(+bookSecondNumber);
        // new Book("Antoine de Saint-Exupéry", "The Little Prince", 1943);
        // System.out.println(+bookThirdNumber);




