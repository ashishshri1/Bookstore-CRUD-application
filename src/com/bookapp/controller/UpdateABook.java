package com.bookapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.book.Book;
import com.bookapp.model.book.BookDao;
import com.bookapp.model.book.BookDaoImplementation;

public class UpdateABook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDao dao=new BookDaoImplementation();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> books=dao.getAll();
		request.setAttribute("books",books);
		RequestDispatcher rd=request.getRequestDispatcher("updateabook.jsp");
		rd.forward(request,response);
	}

}
