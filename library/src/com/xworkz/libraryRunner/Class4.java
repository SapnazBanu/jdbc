package com.xworkz.libraryRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Class4 {
	public static void main(String[] args) {

		String query = "select library_id, library_location from library_table where library_name = 'City Library' and city = 'New York'";
		try {
			Connection connection = null;

			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("library_id") + " " + resultSet.getString("library_location"));
			}

		} catch (SQLException e) {
			e.fillInStackTrace();
		}

	}
}
