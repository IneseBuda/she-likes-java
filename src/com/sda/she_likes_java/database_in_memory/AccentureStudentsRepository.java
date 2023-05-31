package com.sda.she_likes_java.database_in_memory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//Create
//Read
//Update
//delete
public class AccentureStudentsRepository {

    private static final String allStudentsQuery = """
            SELECT ID,NAME,SURNAME,AGE,SEX
                FROM STUDENTS;
            """;

    private Connection dbConnection;
    public AccentureStudentsRepository(Connection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public List<AccentureStudent> getAllStudents(){
       List<AccentureStudent>result = new ArrayList<>();
        try {
            Statement statement = dbConnection.createStatement();
            ResultSet recordsFromDb = statement.executeQuery(allStudentsQuery);

            while (recordsFromDb.next()){
                Integer id = recordsFromDb.getInt("ID");
                String name = recordsFromDb.getString("NAME");
                String surname = recordsFromDb.getString("SURNAME");
                int age = recordsFromDb.getInt("AGE");
                String sex = recordsFromDb.getString("SEX");

                AccentureStudent student = new AccentureStudent(id,name,surname,age,sex);
                result.add(student);
            }

        } catch (SQLException e) {
            System.out.println("Unexpected error: " +e);
        }
        return result;
    }
    public AccentureStudent getStudentById(Long id){
        return null;
    }
    public AccentureStudent saveStudent(AccentureStudent student){
        return null;
    }

    public boolean deleteStudentById(Long id){
        return true;
    }
    public AccentureStudent updateStudent(AccentureStudent student){
        return  null;
    }

}
