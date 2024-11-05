package com.xworkz.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/hospital";
		String userName = "root";
		String password = "8660286768";

		String insertQuery = "INSERT INTO hospital_table (hospital_id, hospital_name, hospital_location) VALUES "
				+ "(1, 'City General Hospital', 'Downtown'), " + "(2, 'Green Valley Medical Center', 'Green Valley'),"
				+ "(3, 'Sunrise Health Clinic', 'Midtown'), " + "(4, 'Lakeside Hospital', 'West End'),"
				+ "(5, 'Central Care Hospital', 'City Center'), " + "(6, 'Riverside Medical Pavilion', 'Riverfront'), "
				+ "(7, 'Hilltop Health Center', 'Uptown'), " + "(8, 'Northside Family Clinic', 'Northside'),"
				+ "(9, 'Eastwood Community Hospital', 'Eastwood'), "
				+ "(10, 'Southpoint Wellness Center', 'Southpoint')," + "(11, 'Willowbrook Hospital', 'Willowbrook'), "
				+ "(12, 'Pinecrest Medical Clinic', 'Pinecrest'), "
				+ "(13, 'Meadowfield Health Center', 'Meadowfield'), "
				+ "(14, 'Redwood Health Services', 'Redwood District'), " + "(15, 'Maplewood Hospital', 'Maplewood'), "
				+ "(16, 'Bayview Hospital', 'Bayview'), " + "(17, 'Seaside Community Clinic', 'Seaside'), "
				+ "(18, 'Mountain View Health Center', 'Highlands'), "
				+ "(19, 'Parkside Wellness Center', 'Parkside'), " + "(20, 'Sunset Health and Care', 'Sunset Avenue')";

		Connection connect = null;

		try {
			connect = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection established");

			Statement statement = connect.createStatement();
			int value = statement.executeUpdate(insertQuery);
			System.out.println("Query saved");
		} catch (SQLException e) {
			System.out.println("Connection not established");
			e.printStackTrace();
		}

	}

}
