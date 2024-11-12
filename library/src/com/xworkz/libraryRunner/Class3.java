package com.xworkz.libraryRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Class3 {
	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String query = "Select num_of_books from library_table where library_id = '10' and library_location = 'New City'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while(resultSet.next()) {
				System.out.println("num_of_books==" + resultSet.getString("num_of_books"));
			}


		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
