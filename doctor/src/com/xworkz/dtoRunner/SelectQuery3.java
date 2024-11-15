package com.xworkz.dtoRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumConnection.ConnectionEnum;

public class SelectQuery3 {

	public static void main(String[] args) {

		String query = "(select consultation_fee from doctor_table where name='Dr. Rachana Nair' and phone_number='+1-776-554-221')";
		try {
			Connection connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(),
					ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			if (!resultSet.next()) {
				System.out.println("No data found in database");
			} else {

				do {

					String fee = resultSet.getString("consultation_fee");
					System.out.println("consultation_fee: " + fee);
				} while (resultSet.next());
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}