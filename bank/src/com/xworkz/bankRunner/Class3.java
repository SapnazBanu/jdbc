package com.xworkz.bankRunner;

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

		String query = "Select monthly_transaction from bank_table where bank_id = '15' and bank_name = 'Omicron Bank'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while(resultSet.next()) {
				System.out.println("monthly_transaction ==" + resultSet.getString("monthly_transaction"));
			}


		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}