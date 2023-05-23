package com.sda.she_likes_java.homework.exercise29;

import java.util.Objects;

public class PostalCode {

    private String postalCode;

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostalCode that = (PostalCode) o;
        return Objects.equals(postalCode, that.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postalCode);
    }

    @Override
    public String toString() {
        return "PostalCode{" +
                "postalCode='" + postalCode + '\'' +
                '}';
    }
}
