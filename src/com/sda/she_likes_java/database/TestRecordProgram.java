package com.sda.she_likes_java.database;

import java.sql.Connection;

public class TestRecordProgram {
    public static void main(String[] args) {
        Connection connection = DatabaseUtils.getConnection();
        System.out.println("Got connection " + (connection!=null));//do we have connection

        TestRecordRepository recordRepository = new TestRecordRepository(connection);
        recordRepository.getAllTestRowsFromDB();
        System.out.println("Let's store some data");
TestRecord newRecord = new TestRecord(5, "First insert");
        recordRepository.storeTestRecordIntoDatabase(newRecord);


    }
}
