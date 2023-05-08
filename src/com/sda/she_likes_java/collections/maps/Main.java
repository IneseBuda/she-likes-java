package com.sda.she_likes_java.collections.maps;

import com.sda.she_likes_java.collections.Person;
import com.sda.she_likes_java.collections.Trousers;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Maps are like dictionary");
//map have two types inside
        Map<String, Trousers> myJeans = new HashMap<>();

        //key: "my favorite jeans" - type of the key is String
        //value: new Trousers("jeans", "big star")
        myJeans.put("my favorite jeans", new Trousers("jeans", "big stars"));
        myJeans.put("my old one",new Trousers("unknown materials", "prmark"));
        myJeans.put("my old one",new Trousers("unknown materials", "prmark II"));//second value overwrite first one

        Map<Person, Trousers> personsTrousers = new HashMap<>();
        personsTrousers.put(new Person("inese", "buda"), new Trousers("jeans","primark"));
        personsTrousers.put(new Person("ilze", "buda"), new Trousers("jeans","primark"));
    }
}
