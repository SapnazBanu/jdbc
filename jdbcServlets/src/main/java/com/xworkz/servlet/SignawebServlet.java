package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.SignaWebDTO;
import com.xworkz.service.SignaWebServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/signUp")
public class SignawebServlet extends HttpServlet {

	public SignawebServlet() {
		System.out.println("Servlet class");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userName = req.getParameter("userName");
		String email = req.getParameter("email");

		SignaWebDTO signaWebDTO = new SignaWebDTO(userName, email);

		SignaWebServiceImpl signaWebServiceImpl = new SignaWebServiceImpl();
		signaWebServiceImpl.save(signaWebDTO);

		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, resp);
	}

}
