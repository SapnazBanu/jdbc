package com.xworkz.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TrainUpdate {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/train";
		String userName = "root";
		String password = "8660286768";
		String updateQuery1 = "update train_table set train_name='Humsafar Express' where train_id=1";
		String updateQuery2 = "update train_table set train_name='Maharashtra Sampark Kranti' where train_id=16";
		String updateQuery3 = "update train_table set train_name='Andaman Express' where train_id=17";
		String updateQuery4 = "update train_table set train_name='Rajkot Express' where train_id=11";
		String updateQuery5 = "update train_table set train_name='Mumbai Duronto' where train_id=4";
		String updateQuery6 = "update train_table set train_name='Kochuveli Express' where train_id=9";
		String updateQuery7 = "update train_table set train_name='Bhagyanagar Express' where train_id=10";
		String updateQuery8 = "update train_table set train_name='Swarna Jayanti Express' where train_id=6";
		String updateQuery9 = "update train_table set train_name='Kashi Vishwanath Express' where train_id=12";
		String updateQuery10 = "update train_table set train_name='Vande Bharat Express' where train_id=10";

		try (Connection connection = DriverManager.getConnection(url, userName, password)) {

			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery1);
			statement.executeUpdate(updateQuery2);
			statement.executeUpdate(updateQuery3);
			statement.executeUpdate(updateQuery4);
			statement.executeUpdate(updateQuery5);
			statement.executeUpdate(updateQuery6);
			statement.executeUpdate(updateQuery7);
			statement.executeUpdate(updateQuery8);
			statement.executeUpdate(updateQuery9);
			statement.executeUpdate(updateQuery10);

			if (statement != null) {
				System.out.println("Updated successfully");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
