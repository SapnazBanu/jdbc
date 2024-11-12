package com.xworkz.bankRunner;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class Class1 {
	public static void main(String args[]) {

		String query = "select branch_name from bank_table where bank_code='EB05' and email='contact@epsilon.com'";

		try {

			Connection connection = null;
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				System.out.println("branch_name ==" + resultSet.getString("branch_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}