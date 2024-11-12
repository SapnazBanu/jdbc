package com.xworkz.ordersRunner;

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

		String query = "Select discount_percentage from orders where customer_id = '5' and total_amount = '200.00'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while(resultSet.next()) {
				System.out.println("discount_percentage ==" + resultSet.getString("discount_percentage"));
			}


		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}