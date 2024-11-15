package com.xworkz.dtoRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.xworkz.enumConnection.ConnectionEnum;

import java.sql.SQLException;

public class SelectQuery4 {
	public static void main(String[] args) {

		String query = "(select email,phone_number from doctor_table where name='Dr. Rachana Nair')";
		try {
			Connection connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(),
					ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			if (!resultSet.next()) {
				System.out.println("No data found in database");
			} else {

				do {

					String email = resultSet.getString("email");
					String phone_number = resultSet.getString("phone_number");
					System.out.println("Email: " + email + ", phone_number: " + phone_number);
				} while (resultSet.next());
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
