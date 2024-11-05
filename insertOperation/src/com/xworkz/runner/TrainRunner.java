package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/train";
		String userName = "root";
		String password = "8660286768";

		String insertQuery = "INSERT INTO train_table (train_id, train_name, ticket_price) VALUES "
		        + "(1, 'Rajdhani Express', 1500), "
		        + "(2, 'Shatabdi Express', 1200), "
		        + "(3, 'Duronto Express', 1000), "
		        + "(4, 'Jan Shatabdi', 600), "
		        + "(5, 'Sampark Kranti Express', 800), "
		        + "(6, 'Garib Rath Express', 500), "
		        + "(7, 'Maharajas Express', 20000), "
		        + "(8, 'Palace on Wheels', 25000), "
		        + "(9, 'Konkan Kanya Express', 900), "
		        + "(10, 'Deccan Odyssey', 22000), "
		        + "(11, 'Nizamuddin Duronto', 1100), "
		        + "(12, 'Goa Express', 800), "
		        + "(13, 'Jansadharan Express', 300), "
		        + "(14, 'Udyan Express', 700), "
		        + "(15, 'Navyug Express', 900), "
		        + "(16, 'Gomti Express', 600), "
		        + "(17, 'Rani Kamlapati Express', 1500), "
		        + "(18, 'Chennai Express', 1200), "
		        + "(19, 'Satyagrah Express', 900), "
		        + "(20, 'Himalayan Queen', 1000)";


		Connection connect = null;

		try {
			connect = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection established");

			Statement statement = connect.createStatement();
			int value = statement.executeUpdate(insertQuery);
			System.out.println("Query saved");
		} catch (SQLException e) {
			System.out.println("Connection not established");
			e.printStackTrace();
		}
	}

}
