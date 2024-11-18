package com.xworkz.bag.DTO;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {

	private String id;
	private String name;
	private String email;
	private String phone;
	private String address;
	private String pincode;

	public ApplicationDTO() {
		System.out.println("No-Args Constructor of ApplicationDTO");
	}

	public ApplicationDTO(String id, String name, String email, String phone, String address, String pincode) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.pincode = pincode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}