package com.xworkz.dtoRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.enumConnection.ConnectionEnum;

public class SelectQuery2 {

	public static void main(String[] args) {

		String query = "(select name from doctor_table where email='supritha.rao@kalyanihospital.com' and phone_number='+1-556-998-123' )";
		try {
			Connection connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(),
					ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			if (!resultSet.next()) {
				System.out.println("No data found in database");
			} else {

				do {

					String name = resultSet.getString("name");
					System.out.println("Name: " + name);
				} while (resultSet.next());
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}