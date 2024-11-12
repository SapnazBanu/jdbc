package com.xworkz.libraryRunner;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Class2 {

    public static void main(String[] args) {

        String query = "SELECT library_id FROM library_table WHERE established_date='1986-12-10' AND phone_no='4075552323'";

        try (Connection connection = DriverManager.getConnection(
                    ConnectionEnum.URL.getValue(), 
                    ConnectionEnum.USERNAME.getValue(), 
                    ConnectionEnum.PASSWORD.getValue());
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                System.out.println("Data from table: " + resultSet.getString("library_id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
