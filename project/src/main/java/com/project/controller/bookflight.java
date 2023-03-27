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

//import com.project.model.flight;
import com.project.utils.flyawayUtills;


@WebServlet("/bookflight")
public class bookflight extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 @Resource(name="jdbc/flyawayproject")
	 private DataSource datasource;
	 private flyawayUtills Util;
	 public void init(ServletConfig config) throws ServletException {
		 try {
			 Util=new flyawayUtills(datasource);
		 }catch(Exception e) {
			 throw new ServletException(e);
		 }
	 }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fid=request.getParameter("fid");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		long  phone=Long.parseLong(request.getParameter("phone"));
		String email=request.getParameter("email");
		int persons=Integer.parseInt(request.getParameter("persons"));
		
		
	
		Util.addpassenger(fid,firstname,lastname,gender,age,phone,email,persons);
		request.setAttribute("persons", persons);
		request.setAttribute("fid",fid);
		request.setAttribute("flight",Util.getflight(fid));
		request.setAttribute("pid",Util.getpassengerid(fid, firstname, lastname, gender, age, phone, email,persons));
		RequestDispatcher ds=request.getRequestDispatcher("/payment.jsp");
		ds.forward(request,response);	

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
