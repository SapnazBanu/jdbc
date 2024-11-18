package com.xworkz.dbConnection;

public enum DbConnection {

	URL("jdbc:mysql://localhost:3306/signin"), USERNAME("root"), PASSWORD("8660286768");

	private String value;

	private DbConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
