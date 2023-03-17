package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out=response.getWriter();
HttpSession session =request.getSession();
String username=(String)session.getAttribute("username");
System.out.println("username="+username);
if(username==null) {
	out.println("User not found in session");
	RequestDispatcher rd=request.getRequestDispatcher("login.html");
	rd.include(request, response);
}
else {
	out.println("User found in session "+username);
	String favcolour=null;
	for(Cookie cookie : request.getCookies()) {
		if(cookie.getName().equalsIgnoreCase("favouritecolour"))
			favcolour=cookie.getValue();
	}
	out.println("<br><p>User's favourite colour ="+favcolour);
}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
