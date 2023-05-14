package com.sda.she_likes_java.homework.exercise25;

import java.util.Objects;

public class CitiesOfLatvia {

    private String name;

    public CitiesOfLatvia(String name) {this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CitiesOfLatvia that = (CitiesOfLatvia) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "CitiesOfLatvia{" +
                "name='" + name + '\'' +
                '}';
    }
}
