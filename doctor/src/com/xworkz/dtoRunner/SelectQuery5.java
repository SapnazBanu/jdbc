package com.xworkz.dtoRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import com.xworkz.enumConnection.ConnectionEnum;

public class SelectQuery5 {

	public static void main(String[] args) {

		String query = "SELECT name FROM doctor_table WHERE id > 3";

		try (Connection connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(),
				ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(query)) {

			boolean hasData = false;

			while (resultSet.next()) {
				hasData = true;
				String name = resultSet.getString("name");
				System.out.println("Name: " + name);
			}

			if (!hasData) {
				System.out.println("No data found in the database");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
