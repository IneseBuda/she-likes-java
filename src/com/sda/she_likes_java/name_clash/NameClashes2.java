package com.sda.she_likes_java.name_clash;


public class NameClashes2 {

    public static void main(String[] args) {

        //referring our own Date class - the best solution
        Date myDate = new Date();
        //java.sql.Date we can use import only if we write hole name-canonical class name
        java.sql.Date sqlDate = new java.sql.Date(100);
        //using our Date class from our package
        com.sda.she_likes_java.name_clash.Date myDate2= new com.sda.she_likes_java.name_clash.Date();

//java.util.Date
        java.util.Date utilDate = new java.util.Date(1000);

    }
}
