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

@WebServlet("/changepwd")
public class changepwd extends HttpServlet {
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
		String password=request.getParameter("password");
		boolean check=Util.setpwd(password);
		if(check) {
			request.setAttribute("msg","Password Changed Successfully..!!! Login Again");
		RequestDispatcher ds=request.getRequestDispatcher("/admin.jsp");
		ds.forward(request, response);}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
