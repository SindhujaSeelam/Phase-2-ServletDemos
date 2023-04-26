package com.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admincheck")
public class admincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String un="Sindhuja";
		String ps="Sindhuja123";
	
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equals(un)&&password.equals(ps)) {
			RequestDispatcher ds= request.getRequestDispatcher("/adminmainpage.jsp");
			ds.forward(request, response);
		}
		else {
			request.setAttribute("msg","Invalid username and password <br>Login Again");
			RequestDispatcher ds= request.getRequestDispatcher("/home.jsp");
			ds.forward(request, response);
		}
	
	}

}
