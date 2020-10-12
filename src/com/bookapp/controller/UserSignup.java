package com.bookapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bookapp.model.user.*;
public class UserSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao users;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		users=new UserDaoImplementation(); 
		String name=(String)request.getParameter("name");
		String email=(String)request.getParameter("email");
		String username=(String)request.getParameter("username");
		String password=(String)request.getParameter("password");
		if(users.containsUser(username)) {
			request.setAttribute("message","User exists. Try again with different username.");
			RequestDispatcher rd=request.getRequestDispatcher("usermessage.jsp");
			rd.forward(request,response);
		}
		else {
			users.add(new User(name,email,username,password));
			request.setAttribute("message","Signed up successfully");
			RequestDispatcher rd=request.getRequestDispatcher("usermessage.jsp");
			rd.forward(request,response);
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
