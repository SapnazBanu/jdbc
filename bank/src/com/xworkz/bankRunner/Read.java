package com.xworkz.bankRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		}catch(ClassNotFoundException e) {
			System.err.println("Driver not installed");
			e.printStackTrace();
		}

		String Url = "jdbc:mysql://localhost:3306/bank";
		String UserName = "root";
		String Password = "8660286768";

		String read = "select * from bank_table";

		try {
			Connection connection = null;
			connection = DriverManager.getConnection(Url,UserName,Password);
			System.out.println("Connection established");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(read);

			while(resultSet.next()) {
				System.out.println("The details are: "+resultSet.getString("bank_name"));
			}

		}catch(SQLException e) {
			System.err.println("Connetion not established");
			e.printStackTrace();
		}
	}
}
