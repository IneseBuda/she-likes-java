package com.sda.she_likes_java.homework.exercise30;

import com.sda.she_likes_java.database.DatabaseUtils;

import java.sql.Connection;

public class StudentTableProgram {
    public static void main(String[] args) {
        Connection connection = DatabaseUtils.getConnection();
        System.out.println("Got connection " + (connection!=null));
        StudentRepository recordRepository = new StudentRepository(connection);
        recordRepository.getAllStudentRowsFromDB();
    }
}
