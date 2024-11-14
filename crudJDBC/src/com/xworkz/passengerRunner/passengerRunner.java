package com.xworkz.passengerRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class passengerRunner {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());
			prst = connection.prepareStatement("insert into passenger_table values (?,?,?,?)");

			prst.setInt(1, 1);
			prst.setString(2, "Rajesh Kumar");
			prst.setInt(3, 29);
			prst.setString(4, "Bangalore");
			prst.executeUpdate();

			prst.setInt(1, 2);
			prst.setString(2, "Priya Sharma");
			prst.setInt(3, 24);
			prst.setString(4, "Mumbai");
			prst.executeUpdate();

			prst.setInt(1, 3);
			prst.setString(2, "Amit Verma");
			prst.setInt(3, 31);
			prst.setString(4, "Delhi");
			prst.executeUpdate();

			prst.setInt(1, 4);
			prst.setString(2, "Sanjana Rao");
			prst.setInt(3, 27);
			prst.setString(4, "Hyderabad");
			prst.executeUpdate();

			prst.setInt(1, 5);
			prst.setString(2, "Vikas Gupta");
			prst.setInt(3, 35);
			prst.setString(4, "Chennai");
			prst.executeUpdate();

			prst.setInt(1, 6);
			prst.setString(2, "Anjali Nair");
			prst.setInt(3, 22);
			prst.setString(4, "Kochi");
			prst.executeUpdate();

			prst.setInt(1, 7);
			prst.setString(2, "Rohan Desai");
			prst.setInt(3, 28);
			prst.setString(4, "Ahmedabad");
			prst.executeUpdate();

			prst.setInt(1, 8);
			prst.setString(2, "Sneha Iyer");
			prst.setInt(3, 26);
			prst.setString(4, "Pune");
			prst.executeUpdate();

			prst.setInt(1, 9);
			prst.setString(2, "Karan Mehta");
			prst.setInt(3, 30);
			prst.setString(4, "Jaipur");
			prst.executeUpdate();

			prst.setInt(1, 10);
			prst.setString(2, "Pooja Patil");
			prst.setInt(3, 23);
			prst.setString(4, "Nagpur");
			prst.executeUpdate();

			prst.setInt(1, 11);
			prst.setString(2, "Arjun Singh");
			prst.setInt(3, 34);
			prst.setString(4, "Lucknow");
			prst.executeUpdate();

			prst.setInt(1, 12);
			prst.setString(2, "Meera Pillai");
			prst.setInt(3, 21);
			prst.setString(4, "Thiruvananthapuram");
			prst.executeUpdate();

			prst.setInt(1, 13);
			prst.setString(2, "Rahul Joshi");
			prst.setInt(3, 32);
			prst.setString(4, "Indore");
			prst.executeUpdate();

			prst.setInt(1, 14);
			prst.setString(2, "Kavita Reddy");
			prst.setInt(3, 25);
			prst.setString(4, "Vizag");
			prst.executeUpdate();

			prst.setInt(1, 15);
			prst.setString(2, "Manoj Pandey");
			prst.setInt(3, 33);
			prst.setString(4, "Patna");
			prst.executeUpdate();

			System.out.println("Data saved for all entries");
		} 
		catch (SQLException e) {
			System.out.println("connection is not established");
			e.printStackTrace();
		}

	}
}
