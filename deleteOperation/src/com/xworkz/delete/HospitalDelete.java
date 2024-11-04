package com.xworkz.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalDelete {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/hospital";
		String userName = "root";
		String password = "8660286768";
		String deleteQuery1 = "delete from hospital_table where hospital_id=11";
		String deleteQuery2 = "delete from hospital_table where hospital_id=12";
		String deleteQuery3 = "delete from hospital_table where hospital_id=13";
		String deleteQuery4 = "delete from hospital_table where hospital_id=14";
		String deleteQuery5 = "delete from hospital_table where hospital_id=15";
		String deleteQuery6 = "delete from hospital_table where hospital_id=16";
		String deleteQuery7 = "delete from hospital_table where hospital_id=17";
		String deleteQuery8 = "delete from hospital_table where hospital_id=18";
		String deleteQuery9 = "delete from hospital_table where hospital_id=19";
		String deleteQuery10 = "delete from hospital_table where hospital_id=20";

		try (Connection connection = DriverManager.getConnection(url, userName, password)) {

			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery1);
			statement.executeUpdate(deleteQuery2);
			statement.executeUpdate(deleteQuery3);
			statement.executeUpdate(deleteQuery4);
			statement.executeUpdate(deleteQuery5);
			statement.executeUpdate(deleteQuery6);
			statement.executeUpdate(deleteQuery7);
			statement.executeUpdate(deleteQuery8);
			statement.executeUpdate(deleteQuery9);
			statement.executeUpdate(deleteQuery10);

			if (statement != null) {
				System.out.println("Deleted Successfully");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
