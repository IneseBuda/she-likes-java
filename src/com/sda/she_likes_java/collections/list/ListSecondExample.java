package com.sda.she_likes_java.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ListSecondExample {
    private static int a;
    private int b;

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ilze");
        names.add("Inese");
        names.add("Ieva");
        names.add("Agnese");
        names.add(3,"Agnese F.");
        List<String>anotherList = names;
//you can not add element at non existent index


        ListSecondExample one = new ListSecondExample();
        one.b = 5;
        ListSecondExample two = new ListSecondExample();
        two.b = 7;
        System.out.println(one.a);
        System.out.println(two.b);//this is example of static
        printNames(names);
        System.out.println("----------------");//separator
        printOnlySurNames(names);
        System.out.println("----------------");//separator
        printNamesWithSemiColon(names);
        System.out.println("Let's add some name to the list");
        addName(names);
        printNames(names);

    }

    public static void printNames(List<String> names) {
        for (String singleName: names) {//loop through every collection
            System.out.println("Name is: " + singleName);
        }
    }
    public  static  void printOnlySurNames(List<String>names){
        //starting from position number 1 - second item
        for (int index = 1; index< names.size(); index++){
            System.out.println("name is: "+ names.get(index));
        }
    }

    //print names in format: name1;name2;name3
    public static void printNamesWithSemiColon(List<String>names){
       String result = names.get(0);
        for (int i=1;i< names.size();i++){
            result+="; "+names.get(i);
        }
        System.out.println(result);
    }
    //add name
    public  static  void addName(List<String>stringList){
        stringList.add("Kitija");
    }

    // finding item inside list

}
