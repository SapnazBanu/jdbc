package com.xworkz.ordersRunner;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Class2 {

    public static void main(String[] args) {

        String query = "SELECT customer_id FROM orders WHERE shipping_address = '101 Birch Lane, Smalltown' AND payment_method = 'Credit Card'";

        try (Connection connection = DriverManager.getConnection(
                    ConnectionEnum.URL.getValue(), 
                    ConnectionEnum.USERNAME.getValue(), 
                    ConnectionEnum.PASSWORD.getValue());
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                System.out.println("Data from table: " + resultSet.getString("customer_id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
