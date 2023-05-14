package com.sda.she_likes_java.homework.exercise25;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CitiesOfLithuania {
    private String name;

    public CitiesOfLithuania(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitiesOfLithuania that = (CitiesOfLithuania) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "CitiesOfLithuania{" +
                "name='" + name + '\'' +
                '}';
    }
}
