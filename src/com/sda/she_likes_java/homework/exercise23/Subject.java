package com.sda.she_likes_java.homework.exercise23;

import java.util.Objects;

public class Subject {
    private String name;
    private int grade;

    public Subject(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return grade == subject.grade && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
