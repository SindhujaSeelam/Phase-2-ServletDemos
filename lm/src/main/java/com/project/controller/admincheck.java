package com.project.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.project.utils.flyawayUtills;

@WebServlet("/admincheck")
public class admincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 @Resource(name="jdbc/flyawayproject")
	 private DataSource datasource;
	 private flyawayUtills Util;

	 public void init(ServletConfig config) throws ServletException {
		 try {
			 Util= new flyawayUtills(datasource);
		 }catch(Exception e) {
			 throw new ServletException(e);
		 }}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		boolean check=Util.getadmincheck(username,password);
		
		if(check) {
			request.setAttribute("username", username);
			request.setAttribute("password", password);
			RequestDispatcher ds=request.getRequestDispatcher("/adminoptions.jsp");
			ds.forward(request,response);
		}
		else {
			request.setAttribute("message","Invalid Login");
			RequestDispatcher ds=request.getRequestDispatcher("/admin.jsp");
			ds.forward(request,response);
		}
	}

}
