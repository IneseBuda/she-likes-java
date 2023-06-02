package com.sda.she_likes_java.exceptions;

import java.util.HashMap;
import java.util.Map;

public class RunTimeExample {
    public static void main(String[] args) {
        try {
           // throwRunTimeException();
            String name = "" ;
            if(name!=null){
                name.length();
            }
        } catch (NullPointerException e) {
            System.out.println("here");
        }
        try {
            int[]numbers = new int [4];
            numbers[99]=1;
        }catch (ArrayIndexOutOfBoundsException e){

        }

    }
    public static void throwRunTimeException() throws MyRunTimeException{
        throw new MyRunTimeException("Do I need to handle it?");
    }

    public static void unexpectedNull(){
        Map<String,String> map=new HashMap<>();
       String  value =  map.get("some key");
       // System.out.println(value.length()); really dangerous
        System.out.println(value != null? value.length():0);
    }
}
