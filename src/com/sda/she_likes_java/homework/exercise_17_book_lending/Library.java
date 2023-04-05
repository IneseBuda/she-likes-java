package com.sda.she_likes_java.homework.exercise_17_book_lending;

import java.util.Random;

public class Library {
    public static void main(String[] args) {


        Book bookFirst = new Book("J.K. Rowling", "Harry Potter", 1997);
        System.out.println("First book info: " + bookFirst);
        System.out.println("Current number of books: " + Book.getNumberOfBook());


        Book bookSecond = new Book("Charlotte Bronte", "Jane Eyre", 1847);
        System.out.println("Second book info: " + bookSecond);
        System.out.println("Current number of book " + Book.getNumberOfBook());

        Book bookThird = new Book("Antoine de Saint-Exupéry", "The Little Prince", 1943);
        System.out.println("Third book info: " + bookThird);
        System.out.println("Current number of book " + Book.getNumberOfBook());

        Random randomBookFirst = new Random();
       Random randomBookSecond = new Random();
        Random randomBookThird = new Random();

        for (int i=0; i<2;i++) {
            int randomNumber1 = randomBookFirst.nextInt(10);
            int randomNumber2 = randomBookSecond.nextInt(10);
            int randomNumber3 = randomBookThird.nextInt(10);

            System.out.println("Random numbers of bookFirst " + randomNumber1);

            System.out.println("Random numbers of bookSecond " + randomNumber2);

            System.out.println("Random numbers of bookThird " + randomNumber3);
            System.out.println("Random books number sum:");
            System.out.println(randomNumber1+randomNumber2+randomNumber3);

        }


        System.out.println("First created number of book " + Book.getNumberOfBook());
       // System.out.println("Current number of Random books " + Book.getRandom());
        System.out.println("Here the number of all created books:");
        System.out.println(Book.getNumberOfBook()+Book.getRandom() +Book.getRandomNumber1()+Book.getRandomNumber2()+Book.getRandomNumber3());

    }

        }













        //private static void randomNumberOfBooks () {


        //  private static void makeSomeRandomBooks() {


        //   new Book("J.K. Rowling", "Harry Potter", 1997);
        //  System.out.println(+bookFirstNumber);
        //  new Book("Charlotte Bronte", "Jane Eyre", 1847);
        //  System.out.println(+bookSecondNumber);
        // new Book("Antoine de Saint-Exupéry", "The Little Prince", 1943);
        // System.out.println(+bookThirdNumber);




