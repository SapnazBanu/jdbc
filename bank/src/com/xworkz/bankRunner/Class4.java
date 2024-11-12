package com.xworkz.bankRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Class4 {
	public static void main(String[] args) {

		String query = "select bank_id,bank_name from bank_table where branch_name='Riverside'and bank_code = 'EB05'";
		try {
			Connection connection = null;

			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("bank_id") + " " + resultSet.getString("bank_name"));
			}

		} catch (SQLException e) {
			e.fillInStackTrace();
		}

	}
}

