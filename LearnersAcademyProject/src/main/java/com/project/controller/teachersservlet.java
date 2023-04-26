package com.project.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.project.model.teachers;
import com.project.utils.portalutils;

@WebServlet("/teachersservlet")
public class teachersservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 @Resource(name="jdbc/learnersacademy")
	 private DataSource datasource;
	 private portalutils Util;
	
	 public void init(ServletConfig config) throws ServletException {
		 try {
			 Util=new portalutils(datasource);
		 }catch(Exception e) {
			 throw new ServletException(e);
		 }
	 }
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<teachers> list = Util.getteachers();
		System.out.println(list);
		request.setAttribute("teacherslist", Util.getteachers());
		RequestDispatcher ds= request.getRequestDispatcher("/teachers.jsp");
		ds.forward(request, response);

	}
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}