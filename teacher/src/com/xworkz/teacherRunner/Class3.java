package com.xworkz.teacherRunner;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Class3 {
	public static void main(String args[]) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String query = "Select last_name from teacher_table where phone_number= '1234567894' and gender = 'F'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while(resultSet.next()) {
				System.out.println("last_name==" + resultSet.getString("last_name"));
			}


		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
