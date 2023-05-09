package com.sda.she_likes_java.homework.exercise23;

import java.util.Objects;

public class Grade {
    private int grade;

    public Grade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade1 = (Grade) o;
        return grade == grade1.grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade);
    }

    @Override
    public String toString() {
        return "Grade{" +
                "grade=" + grade +
                '}';
    }
}
