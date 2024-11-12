package com.xworkz.libraryRunner;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Class1 {
	public static void main(String args[]) {

		String query = "select num_of_books from library_table where established_date = '2000-03-10' and opening_time='10:00:00'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				System.out.println("num_of_books==" + resultSet.getString("num_of_books"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
