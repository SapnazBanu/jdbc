package com.xworkz.libraryRunner;

public enum ConnectionEnum {
	URL("jdbc:mysql://localhost:3306/library"), USERNAME("root"), PASSWORD("8660286768");

	private final String value;
	private ConnectionEnum(String value) {
		System.out.println("value==" + value);
		this.value = value;
		System.out.println("this value==" + this.value);
	}

	public String getValue() {
		return value;
	}
}
