package com.xworkz.coffee.service;

import com.xworkz.coffee.DTO.EmployeeDTO;
import com.xworkz.coffee.repo.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public boolean save(EmployeeDTO dto) {

		boolean verify = true;

		if (dto != null) {

			String userName = dto.getUserName();
			if (userName == null && userName.length() < 3 && userName.length() > 14) {
				System.out.println("In-Valid User Name");
				verify = false;
			}

			String phone = dto.getPhone();
			if (!(phone.length() == 10 && phone.startsWith("9"))) {
				System.out.println("In-Valid Phone Number");
				verify = false;
			}

			String email = dto.getEmail();
			if (email == null && !(email.contains("@") && email.endsWith(".com") && email.indexOf('@') == 8)) {
				System.out.println("In-Valid Email");
				verify = false;
			}

			int exp = dto.getExp();
			if (exp < 1) {
				System.out.println("In-Valid Experience");
				verify = false;
			}

			int age = dto.getAge();
			if (age < 19) {
				System.out.println("In-Valid Age");
				verify = false;
			}

		}

		if (verify) {
			EmployeeRepoImpl repoImpl = new EmployeeRepoImpl();
			return repoImpl.isSaved(dto);

		} else {
			System.out.println("Not Valid Data");
			return false;
		}

	}

}