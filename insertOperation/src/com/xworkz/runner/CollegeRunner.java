package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CollegeRunner {

	public static void main(String[] args) {

		// Providing the Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("The Driver is installed");
		} catch (ClassNotFoundException e) {
			System.out.println("Drivre is not installed");
			e.printStackTrace();
		}

		// Credentials for accessing the database
		String url = "jdbc:mysql://localhost:3306/student";
		String userName = "root";
		String password = "8660286768";

		// Request a connection to database
		Connection connection = null;

		// insert query
		String insertQuery = "insert into college(idcollege,location,clg_name) values(1,'Chikkamagaluru','AIT'),(2,'Shimoga','PES'),"
				+ "(3,'Mangalore','SDIT'),(4,'Bangalore','Jain University'),(5,'Bangalore','WPT'),(6,'Bangalore','GPW'),(7,'Raichur','AMC'),"
				+ "(8,'Nagmangala','Junior College'),(9,'Bellur Cross','BGS'),(10,'Mangalore','ALvas'),(11,'Bengaluru','RV'),(12,'Delhi','University of Delhi'),"
				+ "(13,'Bombay','IIT'),(14,'Trichy','NIT'),(15,'Varanasi','BHU'),(16,'Mumbai','University of Mumbai'),(17,'Tamil Nadu','Anna University'),"
				+ "(18,'Bangalore','IISc'),(19,'Punjab','Panjab University'),(20,'New Delhi','SRCC')";
		// Driver manager is responsible for establishing the connection
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("The connection is established");

			// Statement is used to create create statements and insert the required query
			// Statement will always return integer value.
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
			if (value > 0) {
				System.out.println("Saved");
			} else {
				System.out.println("Not saved");
			}
		} catch (SQLException e) {
			System.out.println("The connection is not established");
			e.printStackTrace();
		}

	}

}