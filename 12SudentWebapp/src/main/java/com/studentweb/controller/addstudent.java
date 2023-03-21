package com.studentweb.controller;

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

import com.studentweb.utils.StudentDataUtills;

@WebServlet("/addstudent")
public class addstudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	 @Resource(name="jdbc/studentweb")
	 private DataSource datasource;
	 private StudentDataUtills studentDataUtil;
	 public void init(ServletConfig config) throws ServletException {
		 try {
			 studentDataUtil=new StudentDataUtills(datasource);
		 }catch(Exception e) {
			 throw new ServletException(e);
		 }}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name=request.getParameter("first_name");
		String last_name=request.getParameter("last_name");
		String email=request.getParameter("email");

		studentDataUtil.addStudent(first_name,last_name,email);
		request.setAttribute("student_list",studentDataUtil.getStudents());
		RequestDispatcher ds=request.getRequestDispatcher("/view_students.jsp");
		ds.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String studentid=request.getParameter("studentid");
		//int id=Integer.parseInt(studentid);
		
	
	}

}
