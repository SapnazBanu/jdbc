package com.xworkz.customerRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class customerRunner {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());
			prst = connection.prepareStatement("insert into customer_table values (?,?,?)");
			prst.setInt(1, 1);
			prst.setString(2, "Rajesh Kumar");
			prst.setString(3, "rajeshkumar@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 2);
			prst.setString(2, "Priya Sharma");
			prst.setString(3, "priyasharma@gmail.com");
			prst.executeUpdate();

			prst.setInt(1, 3);
			prst.setString(2, "Amit Verma");
			prst.setString(3, "amitverma@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 4);
			prst.setString(2, "Sanjana Rao");
			prst.setString(3, "sanjanarao@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 5);
			prst.setString(2, "Vikas Gupta");
			prst.setString(3, "vikasgupta@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 6);
			prst.setString(2, "Anjali Nair");
			prst.setString(3, "anjalinair@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 7);
			prst.setString(2, "Rohan Desai");
			prst.setString(3, "rohan@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 8);
			prst.setString(2, "Sneha Iyer");
			prst.setString(3, "snehaiyer@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 9);
			prst.setString(2, "Karan Mehta");
			prst.setString(3, "karanmehta@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 10);
			prst.setString(2, "Pooja Patil");
			prst.setString(3, "poojapatil@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 11);
			prst.setString(2, "Arjun Singh");
			prst.setString(3, "arjunsingh@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 12);
			prst.setString(2, "Meera Pillai");
			prst.setString(3, "meerapillai@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 13);
			prst.setString(2, "Rahul Joshi");
			prst.setString(3, "rahuljoshi@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 14);
			prst.setString(2, "Kavita Reddy");
			prst.setString(3, "kavitareddy@gamil.com");
			prst.executeUpdate();

			prst.setInt(1, 15);
			prst.setString(2, "Manoj Pandey");
			prst.setString(3, "manojpandey@gamil.com");
			prst.executeUpdate();

			System.out.println("Data saved for all entries");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("connection is not established");
			e.printStackTrace();
		}

	}
}
