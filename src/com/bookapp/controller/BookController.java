package com.bookapp.controller;
import java.util.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.book.*;

public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDao dao=new BookDaoImplementation();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Book> getAllBooks=dao.getAll();
		request.setAttribute("books",getAllBooks);
		RequestDispatcher rd=request.getRequestDispatcher("all_books.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
