package com.xworkz.bag.constants;

public enum ConnectionEnum {

	URL("jdbc:mysql://localhost:3306/application"), USERNAME("root"), PASSWORD("Xworkzodc@123");

	private final String value;

	private ConnectionEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}