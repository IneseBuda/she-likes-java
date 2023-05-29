package com.sda.she_likes_java.homework.exercise30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Exercise 30
 * Write SQL scripts:
 * - Create a Student table with fields:
 * - ID of type Integer
 * - Name type varchar(255)
 * - Surname type varchar(255)
 * - Age type Integer
 * - SEX type varchar(255)
 * Write a script to insert 5 rows into the Student table
 * Add a script to delete students by ID
 */
public class DataBaseConnection {
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Data/she-goes-tech/db",
                    "sa",
                    "sa");

        }catch (SQLException e){
            return null;
        }
    }

}
