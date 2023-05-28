package com.sda.she_likes_java.homework.exercise30;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private static final String allStudentRecordsQuery = """
            SELECT ID, NAME, SURNAME,AGE,SEX
            FROM STUDENT;  """;

    private Connection dbConnection;

    public StudentRepository(Connection dbConnection) {
        this.dbConnection = dbConnection;

    }

    public List<StudentTable> getAllStudentRowsFromDB() {
        List<StudentTable> records = new ArrayList<>();
        try {
            Statement statement = dbConnection.createStatement();
            ResultSet results = statement.executeQuery(allStudentRecordsQuery);

            while (results.next()) {
                Integer idFromDb = results.getInt("ID");
                String nameFromDb = results.getString("NAME");
                String surnameFromDb = results.getString("SURNAME");
                Integer ageFromDb = results.getInt("AGE");
                String sexFromDb = results.getString("SEX");
                StudentTable studentTable = new StudentTable(idFromDb, nameFromDb, surnameFromDb, ageFromDb, sexFromDb);
                records.add(studentTable);
                System.out.println("id: " + idFromDb + ", name: " + nameFromDb + ", surname" + surnameFromDb + ",age" + ageFromDb + ",sex" + sexFromDb);
            }


        } catch (SQLException e) {
            System.out.println("Unexpected exception " + e);
        }
        return records;

    }
}
