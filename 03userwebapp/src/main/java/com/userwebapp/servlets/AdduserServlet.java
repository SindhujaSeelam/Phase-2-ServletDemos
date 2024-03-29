package com.userwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/addUserServlet")
public class AdduserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private Connection connection;
   
    public void init() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    	connection= DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","ThinkPad@66");
    	}catch(SQLException e) {
    		e.printStackTrace();
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
	

		 try (Statement statement = connection.createStatement();){
			 int result=statement.executeUpdate("insert into user values('"+firstname +"', '"+lastname +"', '"+emailId +"','"+password +"')");
				 PrintWriter out=response.getWriter();
					response.setContentType("text/html");

				 if(result>0) {
					 out.println("<h1>User created in DB</h1>");
			 }else {
				 out.println("<h1> Error creating user</h1>");
			 }
					out.println("<a href=\"index.html\">Home</a>");

			 }catch(SQLException e) {
				 e.printStackTrace();
			 } 
	}
public void destroy() {
	if(connection!=null) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}
