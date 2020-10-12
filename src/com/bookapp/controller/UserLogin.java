package com.bookapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bookapp.model.user.*;
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao users;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		users=new UserDaoImplementation();
		String username=(String) request.getParameter("username");
		String password=(String) request.getParameter("password");
		User user=users.getUser(username, password);
		HttpSession session=request.getSession();
		session.setAttribute("user", user);
		if(user!=null)
		{
			RequestDispatcher rd=request.getRequestDispatcher("bookcontroller");
			rd.forward(request,response);
		}
		else {
			request.setAttribute("message","Invalid user credentials");
			RequestDispatcher rd=request.getRequestDispatcher("usermessage.jsp");
			rd.forward(request,response);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
