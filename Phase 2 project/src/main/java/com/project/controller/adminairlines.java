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

import com.project.model.flight;
import com.project.utils.flyawayUtills;

@WebServlet("/adminairlines")
public class adminairlines extends HttpServlet {
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
		List<flight> list=Util.getairlines();
		request.setAttribute("airlinelist",list);
		RequestDispatcher ds=request.getRequestDispatcher("/adminairlinelist.jsp");
		ds.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	;
	}

}
