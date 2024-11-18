package com.xworkz.coffee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.coffee.DTO.EmployeeDTO;
import com.xworkz.coffee.service.EmployeeServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/verify")
public class EmployeeServlet extends HttpServlet {

	public EmployeeServlet() {
		System.out.println("No-Args constructor of EmployeeServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String userName = req.getParameter("userName");
		String phone = req.getParameter("phone");
		String email = req.getParameter("email");
		String exp = req.getParameter("exp");
		String dep = req.getParameter("dep");
		String age = req.getParameter("age");

		int convertedExp = Integer.valueOf(exp);
		int convertedAge = Integer.valueOf(age);

		EmployeeDTO dto = new EmployeeDTO(id, userName, phone, email, convertedExp, dep, convertedAge);

		EmployeeServiceImpl impl = new EmployeeServiceImpl();
		boolean check = impl.save(dto);

	}

}