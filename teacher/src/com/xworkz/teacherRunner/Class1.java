package com.xworkz.teacherRunner;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Class1 {
	public static void main(String args[]) {

		String query = "select email from teacher_table where phone_number = '1234567892' and dob = '1990-11-17'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				System.out.println("data from table ==" + resultSet.getString("email"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
