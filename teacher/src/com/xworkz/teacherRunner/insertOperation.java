package com.xworkz.teacherRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertOperation {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver installed");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not installed");
			e.printStackTrace();
		}
		String insertQuery = "INSERT INTO teacher_table (first_name, last_name, email, phone_number, hire_date, dob, gender, department, salary, rating, experience_years) "
				+ "VALUES "
				+ "('John', 'Doe', 'john.doe@example.com', '1234567890', '2015-08-12', '1980-03-14', 'M', 'Mathematics', 55000.00, 4.50, 10.5), "
				+ "('Jane', 'Smith', 'jane.smith@example.com', '1234567891', '2016-01-15', '1985-06-25', 'F', 'Science', 60000.00, 4.70, 9.0), "
				+ "('Alice', 'Johnson', 'alice.johnson@example.com', '1234567892', '2014-03-30', '1990-11-17', 'F', 'Literature', 52000.00, 4.30, 8.5), "
				+ "('Bob', 'Brown', 'bob.brown@example.com', '1234567893', '2017-07-22', '1982-12-05', 'M', 'History', 48000.00, 4.20, 7.0), "
				+ "('Mary', 'Williams', 'mary.williams@example.com', '1234567894', '2018-10-01', '1992-04-14', 'F', 'Biology', 49000.00, 4.10, 5.0), "
				+ "('Steve', 'Davis', 'steve.davis@example.com', '1234567895', '2015-05-23', '1987-09-09', 'M', 'Physics', 58000.00, 4.60, 12.5), "
				+ "('Olivia', 'Miller', 'olivia.miller@example.com', '1234567896', '2020-02-18', '1995-08-27', 'F', 'Geography', 46000.00, 4.00, 3.0), "
				+ "('Ethan', 'Wilson', 'ethan.wilson@example.com', '1234567897', '2016-04-10', '1989-11-02', 'M', 'Art', 53000.00, 4.40, 6.5), "
				+ "('Sophia', 'Moore', 'sophia.moore@example.com', '1234567898', '2014-09-05', '1984-07-22', 'F', 'Music', 62000.00, 4.80, 10.0), "
				+ "('Daniel', 'Taylor', 'daniel.taylor@example.com', '1234567899', '2019-06-20', '1990-02-12', 'M', 'Mathematics', 55000.00, 4.50, 4.0), "
				+ "('Emma', 'Anderson', 'emma.anderson@example.com', '1234567800', '2021-03-15', '1996-11-05', 'F', 'English', 47000.00, 4.20, 2.0), "
				+ "('Lucas', 'Thomas', 'lucas.thomas@example.com', '1234567801', '2018-09-08', '1983-10-25', 'M', 'Chemistry', 59000.00, 4.65, 9.0), "
				+ "('Mia', 'Jackson', 'mia.jackson@example.com', '1234567802', '2017-12-02', '1993-01-18', 'F', 'History', 52000.00, 4.30, 5.5), "
				+ "('Noah', 'White', 'noah.white@example.com', '1234567803', '2020-05-14', '1988-07-30', 'M', 'Economics', 51000.00, 4.25, 3.5), "
				+ "('Charlotte', 'Harris', 'charlotte.harris@example.com', '1234567804', '2016-11-19', '1984-12-09', 'F', 'Philosophy', 53000.00, 4.35, 7.0), "
				+ "('Liam', 'Martin', 'liam.martin@example.com', '1234567805', '2022-01-10', '1997-05-16', 'M', 'Political Science', 48000.00, 4.10, 1.0), "
				+ "('Ava', 'Lee', 'ava.lee@example.com', '1234567806', '2019-03-12', '1991-04-22', 'F', 'Sociology', 56000.00, 4.60, 5.5), "
				+ "('James', 'Clark', 'james.clark@example.com', '1234567807', '2017-02-17', '1986-09-11', 'M', 'Psychology', 60000.00, 4.75, 8.0), "
				+ "('Isabella', 'Lopez', 'isabella.lopez@example.com', '1234567808', '2015-10-25', '1990-12-03', 'F', 'Art', 57000.00, 4.50, 10.0), "
				+ "('Oliver', 'Walker', 'oliver.walker@example.com', '1234567809', '2021-08-30', '1994-07-19', 'M', 'Computer Science', 65000.00, 4.90, 4.5), "
				+ "('Amelia', 'Allen', 'amelia.allen@example.com', '1234567810', '2018-11-02', '1985-05-20', 'F', 'Engineering', 63000.00, 4.80, 7.5);";

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
