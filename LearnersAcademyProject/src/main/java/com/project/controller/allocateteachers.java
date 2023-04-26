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

import com.project.utils.portalutils;

@WebServlet("/allocateteachers")
public class allocateteachers extends HttpServlet {
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


    		int id= Integer.parseInt(request.getParameter("classid"));
    		System.out.println(id);
    		String teacher=(String) request.getParameter("teacher");
    		Util.setTeacher(id,teacher);
    		request.setAttribute("msg","Allocated successfully!!!!");
    		RequestDispatcher ds= request.getRequestDispatcher("/success.jsp");
    		ds.forward(request, response);
    	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
