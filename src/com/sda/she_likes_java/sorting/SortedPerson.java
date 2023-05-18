package com.sda.she_likes_java.sorting;

import java.util.Objects;

public class SortedPerson implements Comparable<SortedPerson>{

    private final String name;

    private final int age;

    public SortedPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortedPerson that = (SortedPerson) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "SortedPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//natural ordering-just one for class
    @Override
    public int compareTo(SortedPerson o) {
        //age=2 vs o.age=3
       // return age-o.getAge();
      // return o.getAge()-age; //revert position
        System.out.println("Called by java");
        if(age <o.getAge()){
            return -1;
        } else if (age>o.getAge()) {
            return 1;
        }else {
            return 0;
        }

        }
    }

