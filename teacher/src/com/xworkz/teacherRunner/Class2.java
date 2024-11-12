package com.xworkz.teacherRunner;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Class2 {

    public static void main(String[] args) {

        String query = "SELECT dob FROM teacher_table WHERE gender = 'M' AND first_name= 'Steve'";

        try (Connection connection = DriverManager.getConnection(
                    ConnectionEnum.URL.getValue(), 
                    ConnectionEnum.USERNAME.getValue(), 
                    ConnectionEnum.PASSWORD.getValue());
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                System.out.println("Data from table: " + resultSet.getString("dob"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

