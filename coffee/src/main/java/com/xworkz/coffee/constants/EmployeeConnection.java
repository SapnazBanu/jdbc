package com.xworkz.coffee.constants;

public enum EmployeeConnection {

	URL("jdbc:mysql://localhost:3306/employee"), USERNAME("root"), PASSWORD("8660286768");

	private final String value;

	private EmployeeConnection(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
