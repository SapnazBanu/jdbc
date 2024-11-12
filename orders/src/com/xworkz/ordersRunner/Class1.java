package com.xworkz.ordersRunner;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Class1 {
	public static void main(String args[]) {

		String query = "select total_amount from orders where quantity = '5' and product_id = '111'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				System.out.println("data from table ==" + resultSet.getString("total_amount"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}