package com.xworkz.bag.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.bag.DTO.ApplicationDTO;
import com.xworkz.bag.constants.ConnectionEnum;

public class ApplicationRepoImpl implements ApplicationRepo {

	@Override
	public boolean save(ApplicationDTO applicationDTO) {

		Connection connection = null;
		PreparedStatement pre = null;

		boolean isSaved = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Invoking a Driver class");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(ConnectionEnum.URL.getValue(), ConnectionEnum.USERNAME.getValue(),
					ConnectionEnum.PASSWORD.getValue());

			pre = connection.prepareStatement("INSERT INTO apply_table VALUES (?,?,?,?,?,?)");
			pre.setString(1, applicationDTO.getId());
			pre.setString(2, applicationDTO.getName());
			pre.setString(3, applicationDTO.getEmail());
			pre.setString(4, applicationDTO.getPhone());
			pre.setString(5, applicationDTO.getAddress());
			pre.setString(6, applicationDTO.getPincode());
			int i = pre.executeUpdate();

			if (i > 0) {
				System.out.println("Connected Succesfully");
				isSaved = true;
			} else {
				System.err.println("Not Connected");
				isSaved = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isSaved;

	}

}