package com.xworkz.libraryRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not installed");
			e.printStackTrace();
		}
		String insertQuery = "INSERT INTO library_table "
				+ "(library_id, library_location, library_name, city, state, zipcode, num_of_books, email, established_date, phone_no, is_public, opening_time, closing_time) VALUES "
				+ "(1, 'Downtown', 'City Library', 'New York', 'NY', '10001', 100000, 'info@citylibrary.com', '1990-05-15', '2125551234', 1, '08:00:00', '20:00:00'),"
				+ "(2, 'Uptown', 'Uptown Library', 'Chicago', 'IL', '60610', 80000, 'contact@uptownlibrary.com', '1985-09-20', '3125555678', 1, '09:00:00', '18:00:00'),"
				+ "(3, 'Suburb', 'Suburban Library', 'Los Angeles', 'CA', '90001', 60000, 'suburb@library.com', '2000-03-10', '2135556789', 1, '10:00:00', '19:00:00'),"
				+ "(4, 'City Center', 'Metropolitan Library', 'Houston', 'TX', '77002', 120000, 'metro@library.com', '1980-12-25', '7135557890', 1, '07:30:00', '22:00:00'),"
				+ "(5, 'Riverside', 'River Library', 'Miami', 'FL', '33101', 50000, 'river@library.com', '1995-06-18', '3055558912', 1, '08:30:00', '17:00:00'),"
				+ "(6, 'Mountain View', 'Highland Library', 'Denver', 'CO', '80202', 70000, 'highland@library.com', '1975-04-11', '7205559012', 0, '09:00:00', '16:30:00'),"
				+ "(7, 'Beachside', 'Seaside Library', 'San Diego', 'CA', '92101', 45000, 'seaside@library.com', '2005-11-30', '8585551012', 1, '08:45:00', '19:15:00'),"
				+ "(8, 'Downtown', 'Main Library', 'Seattle', 'WA', '98101', 90000, 'main@library.com', '1968-01-15', '2065551111', 1, '07:45:00', '20:45:00'),"
				+ "(9, 'Old Town', 'Historic Library', 'Boston', 'MA', '02108', 35000, 'historic@library.com', '1935-07-04', '6175551212', 0, '09:15:00', '17:15:00'),"
				+ "(10, 'New City', 'Modern Library', 'Austin', 'TX', '73301', 75000, 'modern@library.com', '2010-10-05', '5125551313', 1, '08:00:00', '21:00:00'),"
				+ "(11, 'Harbor', 'Maritime Library', 'San Francisco', 'CA', '94111', 55000, 'maritime@library.com', '1999-08-22', '4155551414', 1, '09:00:00', '18:30:00'),"
				+ "(12, 'Valley', 'Valley Library', 'Phoenix', 'AZ', '85001', 62000, 'valley@library.com', '1988-02-19', '6025551515', 0, '08:30:00', '17:30:00'),"
				+ "(13, 'Hilltop', 'Pine Library', 'Portland', 'OR', '97201', 43000, 'pine@library.com', '1992-07-29', '5035551616', 1, '09:45:00', '18:00:00'),"
				+ "(14, 'Industrial Area', 'Tech Library', 'Detroit', 'MI', '48201', 67000, 'tech@library.com', '2008-05-12', '3135551717', 1, '07:30:00', '21:30:00'),"
				+ "(15, 'Market Street', 'Commerce Library', 'Dallas', 'TX', '75201', 81000, 'commerce@library.com', '1983-09-14', '9725551818', 1, '08:00:00', '20:00:00'),"
				+ "(16, 'Seaside', 'Ocean Library', 'Honolulu', 'HI', '96801', 52000, 'ocean@library.com', '1998-11-05', '8085551919', 1, '09:00:00', '19:30:00'),"
				+ "(17, 'Countryside', 'Rural Library', 'Nashville', 'TN', '37201', 33000, 'rural@library.com', '1978-04-27', '6155552020', 0, '10:00:00', '16:30:00'),"
				+ "(18, 'Central Park', 'Green Library', 'Chicago', 'IL', '60605', 89000, 'green@library.com', '2003-06-09', '3125552121', 1, '08:15:00', '19:15:00'),"
				+ "(19, 'Hill View', 'Vista Library', 'Atlanta', 'GA', '30301', 56000, 'vista@library.com', '2000-03-21', '4045552222', 1, '09:00:00', '18:00:00'),"
				+ "(20, 'Lakeside', 'Lake Library', 'Orlando', 'FL', '32801', 72000, 'lake@library.com', '1986-12-10', '4075552323', 1, '08:30:00', '20:00:00');";

		try {
			Connection connection = null;
			System.out.println("Connection established");
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
			if (value > 0) {
				System.out.println("Data saved");
			} else {
				System.out.println("Not saved");
			}
		} catch (SQLException e) {
			System.err.println("Connection not established");
			e.printStackTrace();
		}

	}
}
