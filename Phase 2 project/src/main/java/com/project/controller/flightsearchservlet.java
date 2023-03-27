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

@WebServlet("/flightsearch")
public class flightsearchservlet extends HttpServlet {
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
		String source=request.getParameter("source");
		String destination=request.getParameter("destination");
		String date=request.getParameter("date");
		int persons=Integer.parseInt(request.getParameter("persons"));
	if(source!=null&&destination!=null&&source!=destination) {
		List<flight>flight=Util.getflight(source,destination,date,persons);
		if(!flight.isEmpty()) {
			request.setAttribute("persons",persons);
		request.setAttribute("flight_list",flight);
		RequestDispatcher ds=request.getRequestDispatcher("/view_flights.jsp");
		ds.forward(request,response);
		}
		else {
			
			request.setAttribute("message","Flights are not available on this date");
			RequestDispatcher ds=request.getRequestDispatcher("/booking.jsp");
			ds.forward(request,response);
		}
		}
	else {
		request.setAttribute("message","Select Valid source and destination");
		RequestDispatcher ds=request.getRequestDispatcher("/booking.jsp");
		ds.forward(request,response);
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
