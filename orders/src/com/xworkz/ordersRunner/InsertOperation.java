package com.xworkz.ordersRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not installed");
			e.printStackTrace();
		}
		String insertQuery = "INSERT INTO orders (customer_id, order_date, shipping_date, total_amount, quantity, product_id, shipping_address, payment_method, discount_percentage, is_paid) "
                + "VALUES "
                + "(1, '2024-11-01', '2024-11-05', 100.50, 2, 101, '123 Maple Street, Springfield', 'Credit Card', 10.5, 1), "
                + "(2, '2024-11-02', '2024-11-06', 250.75, 1, 102, '456 Oak Avenue, Shelbyville', 'PayPal', 5.0, 0), "
                + "(3, '2024-11-03', '2024-11-07', 500.00, 3, 103, '789 Pine Road, Capital City', 'Debit Card', 0.0, 1), "
                + "(4, '2024-11-04', '2024-11-08', 120.30, 5, 104, '101 Birch Lane, Smalltown', 'Credit Card', 15.0, 1), "
                + "(5, '2024-11-05', '2024-11-09', 200.00, 2, 105, '202 Elm Street, Rivertown', 'Bank Transfer', 20.0, 0), "
                + "(6, '2024-11-06', '2024-11-10', 75.40, 1, 106, '303 Cedar Drive, Westfield', 'PayPal', 7.5, 1), "
                + "(7, '2024-11-07', '2024-11-11', 300.25, 4, 107, '404 Walnut Blvd, Hillcrest', 'Credit Card', 12.5, 0), "
                + "(8, '2024-11-08', '2024-11-12', 600.10, 6, 108, '505 Redwood Street, Beachview', 'Debit Card', 0.0, 1), "
                + "(9, '2024-11-09', '2024-11-13', 150.60, 3, 109, '606 Fir Avenue, Greendale', 'PayPal', 10.0, 1), "
                + "(10, '2024-11-10', '2024-11-14', 90.80, 2, 110, '707 Cedar Avenue, Clearwater', 'Credit Card', 5.0, 1), "
                + "(11, '2024-11-11', '2024-11-15', 400.00, 5, 111, '808 Willow Road, Highland', 'Bank Transfer', 0.0, 0), "
                + "(12, '2024-11-12', '2024-11-16', 450.00, 2, 112, '909 Chestnut Street, Springdale', 'Debit Card', 15.0, 1), "
                + "(13, '2024-11-13', '2024-11-17', 220.00, 3, 113, '1010 Pine Road, Lowtown', 'PayPal', 20.0, 0), "
                + "(14, '2024-11-14', '2024-11-18', 800.00, 4, 114, '1111 Oak Lane, Greenfield', 'Credit Card', 0.0, 1), "
                + "(15, '2024-11-15', '2024-11-19', 350.75, 2, 115, '1212 Maple Street, Riverstone', 'Debit Card', 8.0, 1), "
                + "(16, '2024-11-16', '2024-11-20', 125.00, 1, 116, '1313 Birch Road, Seaview', 'PayPal', 5.5, 0), "
                + "(17, '2024-11-17', '2024-11-21', 375.90, 3, 117, '1414 Cedar Street, Oakdale', 'Credit Card', 10.0, 1), "
                + "(18, '2024-11-18', '2024-11-22', 230.00, 2, 118, '1515 Redwood Drive, Hillside', 'Bank Transfer', 12.0, 0), "
                + "(19, '2024-11-19', '2024-11-23', 180.00, 1, 119, '1616 Willow Road, Brookfield', 'Debit Card', 7.0, 1), "
                + "(20, '2024-11-20', '2024-11-24', 500.50, 4, 120, '1717 Chestnut Street, Forestville', 'PayPal', 10.0, 1);";


				
		try {
			Connection connection = null;
			System.out.println("Connection established");
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
			if (value > 0) {
				System.out.println("Data saved");
			} else {
				System.out.println("Not saved");
			}
		} catch (SQLException e) {
			System.err.println("Connection not established");
			e.printStackTrace();
		}

	}
}
