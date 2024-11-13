package com.xworkz.passengerRunner;

public enum ConnectionEnum {
	URL("jdbc:mysql://localhost:3306/passenger"), USERNAME("root"), PASSWORD("8660286768");

	private String value;

	private ConnectionEnum(String value) {
		System.out.println("value=" + value);
		this.value = value;
		System.out.println("value=" + this.value);
	}

	public String getValue() {
		return value;
	}

}
