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
			connection = DriverManager.getConnection(
				ConnectionEnum.URL.getValue(),
				ConnectionEnum.USERNAME.getValue(),
				ConnectionEnum.PASSWORD.getValue()
			);

			prst = connection.prepareStatement("INSERT INTO customer_table VALUES (?, ?, ?)");

			prst.setInt(1, 1);
			prst.setString(2, "Rajesh Kumar");
			prst.setString(3, "rajeshkumar@gmail.com");
			int a = prst.executeUpdate();

			prst.setInt(1, 2);
			prst.setString(2, "Priya Sharma");
			prst.setString(3, "priyasharma@gmail.com");
			int b = prst.executeUpdate();

			prst.setInt(1, 3);
			prst.setString(2, "Amit Verma");
			prst.setString(3, "amitverma@gmail.com");
			int c = prst.executeUpdate();

			prst.setInt(1, 4);
			prst.setString(2, "Sanjana Rao");
			prst.setString(3, "sanjanarao@gmail.com");
			int d = prst.executeUpdate();

			prst.setInt(1, 5);
			prst.setString(2, "Vikas Gupta");
			prst.setString(3, "vikasgupta@gmail.com");
			int e = prst.executeUpdate();

			prst.setInt(1, 6);
			prst.setString(2, "Anjali Nair");
			prst.setString(3, "anjalinair@gmail.com");
			int f = prst.executeUpdate();

			prst.setInt(1, 7);
			prst.setString(2, "Rohan Desai");
			prst.setString(3, "rohan@gmail.com");
			int g = prst.executeUpdate();

			prst.setInt(1, 8);
			prst.setString(2, "Sneha Iyer");
			prst.setString(3, "snehaiyer@gmail.com");
			int h = prst.executeUpdate();

			prst.setInt(1, 9);
			prst.setString(2, "Karan Mehta");
			prst.setString(3, "karanmehta@gmail.com");
			int i = prst.executeUpdate();

			prst.setInt(1, 10);
			prst.setString(2, "Pooja Patil");
			prst.setString(3, "poojapatil@gmail.com");
			int j = prst.executeUpdate();

			prst.setInt(1, 11);
			prst.setString(2, "Arjun Singh");
			prst.setString(3, "arjunsingh@gmail.com");
			int k = prst.executeUpdate();

			prst.setInt(1, 12);
			prst.setString(2, "Meera Pillai");
			prst.setString(3, "meerapillai@gmail.com");
			int l = prst.executeUpdate();

			prst.setInt(1, 13);
			prst.setString(2, "Rahul Joshi");
			prst.setString(3, "rahuljoshi@gmail.com");
			int m = prst.executeUpdate();

			prst.setInt(1, 14);
			prst.setString(2, "Kavita Reddy");
			prst.setString(3, "kavitareddy@gmail.com");
			int n = prst.executeUpdate();

			prst.setInt(1, 15);
			prst.setString(2, "Manoj Pandey");
			prst.setString(3, "manojpandey@gmail.com");
			int o = prst.executeUpdate();

			
			int[] values = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o };
			for (int value : values) {
				if (value > 0) {
					System.out.println("Data is saved");
				} else {
					System.out.println("Data is not saved");
				}
			}
		} 
		catch (SQLException e) {
			System.out.println("Connection is not established");
			e.printStackTrace();
		}
	}
}
