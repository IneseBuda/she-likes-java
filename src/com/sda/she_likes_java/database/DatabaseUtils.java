package com.sda.she_likes_java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
    /**
     * Script for creating table
     * CREATE TABLE TEST
     * (ID INT PRIMARY KEY, NAME VARCHAR(255));
     *
     * script for inserting one record(row) into table;
     * INSERT INTO TEST(ID, NAME)
     * VALUES(1, 'iNESE');
     *
     * Script for reading data
     * Select ID,Name
     * from test
     *
     * script for updating data
     * UPDATE TEST --name of table to update
     * SET NAME = 'INESE' --column value to change
     * WHERE ID=1 --which row
     *
     * script for DELETING data
     * DELETE
     * FROM TEST
     * WHERE ID=3
     */
//Handle internally
    public static Connection getConnection()  {
       try {
            return DriverManager.getConnection("jdbc:h2:~\\Data\\she-goes-tech\\db",
                    "sa",
                    "sa");
       } catch (SQLException e) {
           return  null;
          }
       //  return DriverManager.getConnection(" return DriverManager.getConnection(\"jdbc:h2:~\\\\Data\\\\she-goes-tech\\\\db\",\n" +
       //                  "                \"sa\",\n" +
        //                 "                \"sa\");",
        //        "sa",
        //      "sa");
        }
       // declare
       public static Connection getConnectionButSometimesThrowException() throws SQLException {
           return DriverManager.getConnection("jdbc:h2:~\\Data\\she-goes-tech\\db",
                   "sa",
                   "sa");
    }
    }

