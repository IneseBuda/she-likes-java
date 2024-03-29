package com.sda.she_likes_java.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TestRecordRepository {

    private static final String allTestRecordsQuery = """
            SELECT ID, NAME
            FROM TEST;
            """;
    private static final String addRecordQuery= """
            INSERT INTO TEST(ID, NAME)
            VALUES (?,?); 
            """;
    //-- no semicolon, quotes need for unknown values above!!!
    private Connection dbConnection;

    public TestRecordRepository(Connection dbConnection) {

        this.dbConnection = dbConnection;
    }
public List<TestRecord> getAllTestRowsFromDB(){
        List<TestRecord>records = new ArrayList<>();
        //send query to Data base
    try {
        //statement - current query
        Statement statement = dbConnection.createStatement();
        //get result
        ResultSet results = statement.executeQuery(allTestRecordsQuery);


        //map result to java objects - TestRecord

        while (results.next()){ //GO ROW BY ROW
            Integer idFromDb = results.getInt("ID");
            String titleFromDb = results.getString("NAME");
            TestRecord recordFromDb = new TestRecord(idFromDb,titleFromDb);
            records.add(recordFromDb);
            System.out.println("id: " + idFromDb + ", title: " + titleFromDb);
        }
    } catch (SQLException e) {
        System.out.println("Unexpected exception " + e);;
    }


    return records;
}

//below how to put data in Inteligy and send to database
public boolean storeTestRecordIntoDatabase(TestRecord dataToStore){

    try {
        PreparedStatement preparedStatement = dbConnection.prepareStatement(addRecordQuery);
   preparedStatement.setInt(1, dataToStore.getId());
   preparedStatement.setString(2, dataToStore.getTitle());

   preparedStatement.execute();
    } catch (SQLException e) {
        System.out.println("Unexpected exception: " + e);
        return false;
    }
    return true;
}

}
