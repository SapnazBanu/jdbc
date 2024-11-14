package com.xworkz.clientRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class clientRunner {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement prst = null;

		try {
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());

			prst = connection.prepareStatement("INSERT INTO client_table VALUES(?, ?, ?, ?)");

			prst.setInt(1, 1);
			prst.setString(2, "Anu");
			prst.setString(3, "Bengaluru");
			prst.setString(4, "4589623568");
			int a = prst.executeUpdate();

			prst.setInt(1, 2);
			prst.setString(2, "Banu");
			prst.setString(3, "Bengaluru");
			prst.setString(4, "4586239875");
			int b = prst.executeUpdate();

			prst.setInt(1, 3);
			prst.setString(2, "Viji");
			prst.setString(3, "Chikkamagaluru");
			prst.setString(4, "8659745236");
			int c = prst.executeUpdate();

			prst.setInt(1, 4);
			prst.setString(2, "Gagana");
			prst.setString(3, "Shimogga");
			prst.setString(4, "7785694235");
			int d = prst.executeUpdate();

			prst.setInt(1, 5);
			prst.setString(2, "Sanju");
			prst.setString(3, "Mysore");
			prst.setString(4, "8897544865");
			int e = prst.executeUpdate();

			prst.setInt(1, 6);
			prst.setString(2, "Ravi");
			prst.setString(3, "Hubli");
			prst.setString(4, "9988563256");
			int f = prst.executeUpdate();

			prst.setInt(1, 7);
			prst.setString(2, "Deepa");
			prst.setString(3, "Belgaum");
			prst.setString(4, "8876542135");
			int g = prst.executeUpdate();

			prst.setInt(1, 8);
			prst.setString(2, "Kiran");
			prst.setString(3, "Davangere");
			prst.setString(4, "7765894256");
			int h = prst.executeUpdate();

			prst.setInt(1, 9);
			prst.setString(2, "Manu");
			prst.setString(3, "Udupi");
			prst.setString(4, "6689562145");
			int i = prst.executeUpdate();

			prst.setInt(1, 10);
			prst.setString(2, "Asha");
			prst.setString(3, "Mangalore");
			prst.setString(4, "7568954231");
			int j = prst.executeUpdate();

			prst.setInt(1, 11);
			prst.setString(2, "Teju");
			prst.setString(3, "Kalaburagi");
			prst.setString(4, "6457893215");
			int k = prst.executeUpdate();

			prst.setInt(1, 12);
			prst.setString(2, "Kavya");
			prst.setString(3, "Hassan");
			prst.setString(4, "9987456321");
			int l = prst.executeUpdate();

			prst.setInt(1, 13);
			prst.setString(2, "Ramesh");
			prst.setString(3, "Tumkur");
			prst.setString(4, "9896543214");
			int m = prst.executeUpdate();

			prst.setInt(1, 14);
			prst.setString(2, "Suma");
			prst.setString(3, "Bagalkot");
			prst.setString(4, "8789654231");
			int n = prst.executeUpdate();

			prst.setInt(1, 15);
			prst.setString(2, "Rani");
			prst.setString(3, "Raichur");
			prst.setString(4, "7689541236");
			int o = prst.executeUpdate();

			int[] values = { a, b, c, d, e, f, g, h, i, j, k, l, m, n, o };
			for (int value : values) {
				if (value > 0) {
					System.out.println("Data is saved");
				} else {
					System.out.println("Data is not saved");
				}
			}
		} catch (

		SQLException e) {
			System.err.println("Connection is not established");
			e.printStackTrace();
		}
	}
}
