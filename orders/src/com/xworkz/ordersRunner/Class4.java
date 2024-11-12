package com.xworkz.ordersRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Class4 {
	public static void main(String[] args) {

		String query = "select order_date, customer_id from orders where total_amount = '250.75' and payment_method = 'PayPal'";
		try {
			Connection connection = null;

			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("order_date") + " " + resultSet.getString("customer_id"));
			}

		} catch (SQLException e) {
			e.fillInStackTrace();
		}

	}
}
