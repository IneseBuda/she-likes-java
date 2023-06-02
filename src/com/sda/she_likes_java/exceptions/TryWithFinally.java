package com.sda.she_likes_java.exceptions;

public class TryWithFinally {

    public static void main(String[] args) {
        try {
            System.out.println("Try without exception");
        }finally {
            System.out.println("Finally");
        }

        try {
            System.out.println("Again try without exception");
        }catch (Exception exception){
            System.out.println("It shouldn't be printed");
        }finally {
            System.out.println("Finally");
        }

        try {
            System.out.println("Now, let's be serious");
            throw new DecryptionIssueException("Some problem");
         //   System.out.println("haha");cant write after throw
        }catch (Exception exception){
            System.out.println("Some exception occurred" + exception);
        }finally {
            System.out.println("Finally again");
        }
    }
}
