package com.xworkz.bankRunner;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Class2 {

    public static void main(String[] args) {

        String query = "SELECT bank_id FROM bank_table WHERE credit_score = '750' AND num_of_atms='12'";

        try (Connection connection = DriverManager.getConnection(
                    ConnectionEnum.URL.getValue(), 
                    ConnectionEnum.USERNAME.getValue(), 
                    ConnectionEnum.PASSWORD.getValue());
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                System.out.println("bank_id: " + resultSet.getString("bank_id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

