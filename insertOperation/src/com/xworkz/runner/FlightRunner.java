package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FlightRunner {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/flight";
		String userName = "root";
		String password = "8660286768";

		String insertQuery = "INSERT INTO flight_table (flight_id, flight_name, ticket_price) VALUES "
				+ "(1, 'IndiGo 6E', 3500), " + "(2, 'Air India AI', 4500), " + "(3, 'SpiceJet SG', 3200), "
				+ "(4, 'Vistara UK', 5000), " + "(5, 'GoAir G8', 3700), " + "(6, 'AirAsia I5', 3000), "
				+ "(7, 'Jet Airways 9W', 4800), " + "(8, 'British Airways BA', 15000), "
				+ "(9, 'Qatar Airways QR', 12000), " + "(10, 'Emirates EK', 16000), " + "(11, 'Lufthansa LH', 14000), "
				+ "(12, 'Singapore Airlines SQ', 13000), " + "(13, 'Cathay Pacific CX', 15500), "
				+ "(14, 'American Airlines AA', 16500), " + "(15, 'United Airlines UA', 17000), "
				+ "(16, 'Etihad Airways EY', 17500), " + "(17, 'Alitalia AZ', 16000), "
				+ "(18, 'Turkish Airlines TK', 15000), " + "(19, 'Thai Airways TG', 14500), "
				+ "(20, 'KLM Royal Dutch Airlines KL', 15500)";

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
