package com.bookapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=(String) request.getParameter("username");
		String password=(String) request.getParameter("password");
		if("admin".equals(username)&&"admin".equals(password))
		{
			HttpSession session=request.getSession();
			session.setAttribute("admin_username",username);
			session.setAttribute("admin_password",password);
			RequestDispatcher rd=request.getRequestDispatcher("adminbookcontroller.jsp");
			rd.forward(request,response);
		}
		else {
			request.setAttribute("message","Invalid admin credentials");
			RequestDispatcher rd=request.getRequestDispatcher("usermessage.jsp");
			rd.forward(request,response);
		}
	}

}