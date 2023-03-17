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

import com.studentweb.model.Student;
import com.studentweb.utils.StudentDataUtills;

@WebServlet("/loadstudent")
public class LoadDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 @Resource(name="jdbc/studentweb")
	 private DataSource datasource;
	 private StudentDataUtills studentDataUtil;
	 public void init(ServletConfig config) throws ServletException {
		 try {
			 studentDataUtil=new StudentDataUtills(datasource);
		 }catch(Exception e) {
			 throw new ServletException(e);
		 }
	 }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String studentid=request.getParameter("studentid");
int id=Integer.parseInt(studentid);
Student student =studentDataUtil.getStudent(id);
request.setAttribute("student",student);
RequestDispatcher ds=request.getRequestDispatcher("/update_students.jsp");
ds.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				doGet(request, response);
	}

}
