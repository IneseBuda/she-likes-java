package com.sda.she_likes_java.objects_equality;

public class Main {
    public static void main(String[] args) {
        int a=5, b=10;
        int c=5;

        System.out.println("are a and b equal? " + (a==b));
        System.out.println("are a and b equal? " + (a==c));

        String name1 = new String("inese");
        String name2 = new String("inese");
        System.out.println("name1 == name2" + (name1==name2));
        String name3 = name2;// it is true because compares objects
        System.out.println("name3 == name2" + (name3==name2));

        Person first = new Person("inese","buda",18);
        Person second = new Person("inese","buda",18);
       Person third = second;

        System.out.println("are persons equal? " + (first==second));
        System.out.println("first is equal to second " + (first.equals(second)));
        System.out.println("first is equal to second " + (third.equals(second)));
    }
}
