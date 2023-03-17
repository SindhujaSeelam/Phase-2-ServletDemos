package com.mvc.demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.demo.utils.UserDataUtil;
@WebServlet("/mvcdemo")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DemoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
      request.setAttribute("user_list",UserDataUtil.getUsers());
	  RequestDispatcher ds=request.getRequestDispatcher("/view_users.jsp");
	  ds.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
