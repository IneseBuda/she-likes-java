package com.sda.she_likes_java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
//Handle internally
    public static Connection getConnection() throws SQLException {
       try {
            return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/databases/jdbc",
                    "sa",
                    "");
       } catch (SQLException e) {
           return  null;
          }
       //   return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/databases/jdbc",
       //          "sa",
         //      "");
        }
        //declare
        public static Connection getConnectionButSometimesThrowException () throws SQLException {
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/databases/jdbc\",\n" +
                "                    \"sa\",\n" +
                "                    \"\"");
    }
    }

