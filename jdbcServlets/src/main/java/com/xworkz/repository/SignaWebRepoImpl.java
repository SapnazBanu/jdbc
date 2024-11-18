package com.xworkz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.dbConnection.DbConnection;
import com.xworkz.dto.SignaWebDTO;

public class SignaWebRepoImpl implements SignaWebRepository {

	@Override
	public boolean save(SignaWebDTO signaWebDTO) {

		boolean isValid = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = null;

			connection = DriverManager.getConnection(DbConnection.URL.getValue(), DbConnection.USERNAME.getValue(),
					DbConnection.PASSWORD.getValue());

			PreparedStatement prest = null;

			prest = connection.prepareStatement("INSERT INTO details (username, email) VALUES (?, ?)");

			prest.setString(1, signaWebDTO.getUserName());
			prest.setString(2, signaWebDTO.getEmail());

			int value = prest.executeUpdate();
			if (value > 0) {
				System.out.println("Data is saved");
				isValid = true;
			} else {
				isValid = false;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isValid;
	}

}
