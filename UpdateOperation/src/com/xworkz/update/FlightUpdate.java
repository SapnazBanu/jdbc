package com.xworkz.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FlightUpdate {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/flight";
		String userName = "root";
		String password = "8660286768";
		String updateQuery1 = "update flight_table set flight_name='SkyHigh Airlines' where flight_id=1";
		String updateQuery2 = "update flight_table set flight_name='Blue Sky Airways' where flight_id=12";
		String updateQuery3 = "update flight_table set flight_name='JetStream Airlines' where flight_id=11";
		String updateQuery4 = "update flight_table set flight_name='Cloud Nine Flights' where flight_id=6";
		String updateQuery5 = "update flight_table set flight_name='AeroJet Airlines' where flight_id=8";
		String updateQuery6 = "update flight_table set flight_name='Flying Falcon Airways' where flight_id=9";
		String updateQuery7 = "update flight_table set flight_name='Dreamliner Airways' where flight_id=4";
		String updateQuery8 = "update flight_table set flight_name='Wings of Gold Airlines' where flight_id=2";
		String updateQuery9 = "update flight_table set flight_name='Rapid Air' where flight_id=3";
		String updateQuery10 = "update flight_table set flight_name='Global Jet Airlines' where flight_id=14";

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
