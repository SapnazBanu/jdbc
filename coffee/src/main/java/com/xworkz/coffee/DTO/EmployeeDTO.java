package com.xworkz.coffee.DTO;

public class EmployeeDTO {

	private String id;
	private String userName;
	private String phone;
	private String email;
	private int exp;
	private String dep;
	private int age;

	public EmployeeDTO() {
		System.out.println("No-Args of EmployeeDTO");
	}

	public EmployeeDTO(String id, String userName, String phone, String email, int exp, String dep, int age) {
		super();
		this.id = id;
		this.userName = userName;
		this.phone = phone;
		this.email = email;
		this.exp = exp;
		this.dep = dep;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}