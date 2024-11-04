package com.xworkz.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalUpdate {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/hospital";
		String userName = "root";
		String password = "8660286768";
		String updateQuery1 = "update hospital_table set hospital_name='Victoria' where hospital_id=1";
		String updateQuery2 = "update hospital_table set hospital_name='Nimhans' where hospital_id=15";
		String updateQuery3 = "update hospital_table set hospital_name='NH' where hospital_id=17";
		String updateQuery4 = "update hospital_table set hospital_name='Apollo' where hospital_id=11";
		String updateQuery5 = "update hospital_table set hospital_name='Green Hills Medical Pavilion' where hospital_id=18";
		String updateQuery6 = "update hospital_table set hospital_name='Cedar Ridge Hospital' where hospital_id=4";
		String updateQuery7 = "update hospital_table set hospital_name='Silverlake Wellness Center' where hospital_id=9";
		String updateQuery8 = "update hospital_table set hospital_name='Fortis Healthcare' where hospital_id=6";
		String updateQuery9 = "update hospital_table set hospital_name='Breach Candy Hospital ' where hospital_id=12";
		String updateQuery10 = "update hospital_table set hospital_name='Jaypee Hospital ' where hospital_id=10";

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
