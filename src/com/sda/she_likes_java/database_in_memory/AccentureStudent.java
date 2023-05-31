package com.sda.she_likes_java.database_in_memory;

public class AccentureStudent {

    private Integer id;

    private String name;

    private String surname;

    private int studentAge; //if not nullable can be int

    private String sex;

    public AccentureStudent(Integer id, String name, String surname, int studentAge, String sex) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.studentAge = studentAge;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "AccentureStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentAge=" + studentAge +
                ", sex='" + sex + '\'' +
                '}';
    }
}
