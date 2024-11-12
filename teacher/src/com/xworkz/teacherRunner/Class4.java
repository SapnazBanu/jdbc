package com.xworkz.teacherRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.xdevapi.Result;

public class Class4 {
	public static void main(String[] args) {

		String query = "select first_name, last_name from teacher_table where dob = '1990-11-17' and gender = 'F'";
		try {
			Connection connection = null;

			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(), ConnectionEnum.PASSWORD.getValue());
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery(query);
			while(resultSet.next()) {
				System.out.println(resultSet.getString("first_name")+ " "+resultSet.getString("last_name"));
			}

		}catch(SQLException e) {
			e.fillInStackTrace();
		}

	}
}