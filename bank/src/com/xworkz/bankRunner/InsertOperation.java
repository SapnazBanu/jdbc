package com.xworkz.bankRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		} catch (ClassNotFoundException e)
		{
			System.out.println("Driver not installed");
			e.printStackTrace();
		}
		String insertQuery = "insert into bank_table(bank_id, bank_name, branch_name, bank_code, email, credit_score, is_online, num_of_atms, monthly_transaction, atm_year, rating, branch_open_time, branch_close_time, total_loans_issued,has_cryptocurrency_support, annual_gross_profit, minimum_balance,is_multinational, foreign_bank_id, branch_manager_name, number_of_employees)VALUES"
				+ "(1, 'Alpha Bank', 'Downtown', 'AB01', 'contact@alphabank.com', 750, 1, 12, 3000, 2015, 4, '09:00:00', '17:00:00', 500, 1, 1000000.50, 100.00, 1, NULL, 'John Doe', 45),"
				+ "(2, 'Beta Bank', 'Uptown', 'BB02', 'info@betabank.com', 680, 1, 15, 2500, 2016, 3, '08:30:00', '16:30:00', 400, 0, 800000.75, 50.00, 0, NULL, 'Jane Smith', 30),"
				+ "(3, 'Gamma Bank', 'Suburb', 'GB03', 'support@gammabank.com', 720, 0, 8, 1500, 2018, 5, '10:00:00', '18:00:00', 300, 1, 500000.00, 200.00, 0, NULL, 'Mike Lee', 25),"
				+ "(4, 'Delta Bank', 'City Center', 'DB04', 'service@deltabank.com', 800, 1, 20, 4000, 2014, 4, '09:30:00', '17:30:00', 700, 0, 1200000.00, 150.00, 1, 10, 'Emily Davis', 50),"
				+ "(5, 'Epsilon Bank', 'Riverside', 'EB05', 'contact@epsilon.com', 690, 0, 10, 1800, 2019, 3, '09:00:00', '16:00:00', 350, 1, 600000.00, 80.00, 0, NULL, 'Chris Walker', 20),"
				+ "(6, 'Zeta Bank', 'Mountain View', 'ZB06', 'info@zetabank.com', 770, 1, 18, 3200, 2017, 5, '08:00:00', '15:30:00', 650, 0, 950000.00, 120.00, 1, 12, 'Alice Brown', 35),"
				+ "(7, 'Eta Bank', 'Downtown', 'EB07', 'help@etabank.com', 720, 1, 14, 2900, 2020, 4, '10:30:00', '19:00:00', 400, 0, 780000.00, 90.00, 0, NULL, 'Robert Black', 40),"
				+ "(8, 'Theta Bank', 'Beachside', 'TB08', 'support@theta.com', 710, 1, 9, 2600, 2013, 4, '11:00:00', '20:00:00', 360, 1, 550000.00, 110.00, 0, NULL, 'Olivia White', 28),"
				+ "(9, 'Iota Bank', 'Seaside', 'IB09', 'customer@iota.com', 650, 0, 7, 2100, 2021, 2, '09:00:00', '17:00:00', 300, 1, 400000.00, 70.00, 0, NULL, 'Liam Green', 18),"
				+ "(10, 'Kappa Bank', 'Hilltop', 'KB10', 'contact@kappabank.com', 800, 1, 22, 4200, 2012, 5, '08:30:00', '16:30:00', 800, 1, 1400000.00, 250.00, 1, 15, 'Charlotte Blue', 55),"
				+ "(11, 'Lambda Bank', 'Valley', 'LB11', 'info@lambdabank.com', 720, 0, 12, 2700, 2017, 4, '10:00:00', '18:00:00', 450, 0, 880000.00, 140.00, 0, NULL, 'David King', 22),"
				+ "(12, 'Mu Bank', 'Lakeside', 'MB12', 'service@mu.com', 760, 1, 16, 3300, 2016, 4, '09:15:00', '17:15:00', 500, 1, 970000.00, 180.00, 1, 8, 'Sophia Brown', 37),"
				+ "(13, 'Nu Bank', 'Central Park', 'NB13', 'help@nupark.com', 700, 0, 11, 2400, 2015, 3, '09:00:00', '17:30:00', 350, 0, 680000.00, 130.00, 1, 9, 'Oliver Hill', 25),"
				+ "(14, 'Xi Bank', 'Old Town', 'XB14', 'support@xibank.com', 810, 1, 20, 4100, 2018, 5, '08:30:00', '17:00:00', 900, 1, 1500000.00, 300.00, 1, 11, 'Ella River', 60),"
				+ "(15, 'Omicron Bank', 'New City', 'OB15', 'contact@omicron.com', 780, 1, 19, 3500, 2014, 4, '09:00:00', '18:00:00', 600, 1, 1100000.00, 160.00, 1, NULL, 'Mia Sky', 45),"
				+ "(16, 'Pi Bank', 'Downtown', 'PB16', 'service@pi.com', 660, 0, 6, 1700, 2022, 2, '11:00:00', '19:30:00', 250, 0, 400000.00, 60.00, 0, NULL, 'Noah Star', 15),"
				+ "(17, 'Rho Bank', 'Countryside', 'RB17', 'info@rho.com', 730, 1, 13, 2800, 2013, 3, '09:30:00', '17:00:00', 420, 0, 850000.00, 100.00, 1, 14, 'Logan Stone', 32),"
				+ "(18, 'Sigma Bank', 'Industrial Area', 'SB18', 'support@sigma.com', 770, 1, 21, 3900, 2012, 4, '08:00:00', '16:30:00', 750, 1, 1250000.00, 220.00, 1, 17, 'Harper Moon', 50),"
				+ "(19, 'Tau Bank', 'Market Street', 'TB19', 'help@tau.com', 700, 0, 5, 1400, 2019, 2, '10:00:00', '16:30:00', 280, 0, 350000.00, 50.00, 0, NULL, 'Benjamin Lake', 12),"
				+ "(20, 'Upsilon Bank', 'Harbor', 'UB20', 'contact@upsilon.com', 750, 1, 17, 3000, 2015, 4, '09:15:00', '17:15:00', 520, 1, 900000.00, 125.00, 1, 20, 'Ava Rose', 40)";

	

		try {
			Connection connection = null;
			System.out.println("Connection established");
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate(insertQuery);
			if(value>0) 
			{
				System.out.println("Data saved");
			}
			else
			{
				System.out.println("Not saved");
			}
		}
			catch (SQLException e) 
			{
			System.err.println("Connection not established");
			e.printStackTrace();
			}

		
	}
}
	

