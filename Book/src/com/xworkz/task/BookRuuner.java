package com.xworkz.task;

public class BookRuuner {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
