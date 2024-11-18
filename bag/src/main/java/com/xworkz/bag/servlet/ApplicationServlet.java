package com.xworkz.bag.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.bag.DTO.ApplicationDTO;
import com.xworkz.bag.service.ApplicationService;
import com.xworkz.bag.service.ApplicationServiceImpl;

@WebServlet("/jdbcServlet")
public class ApplicationServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		String pincode = req.getParameter("pincode");

		ApplicationDTO applicationDTO = new ApplicationDTO(id, name, email, phone, address, pincode);

		ApplicationService service = new ApplicationServiceImpl();
		boolean check = service.validation(applicationDTO);

	}

}
