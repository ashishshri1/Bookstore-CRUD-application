package com.bookapp.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.model.book.*;

public class AddingBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDao dao = new BookDaoImplementation();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String isbn = request.getParameter("isbn");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		Date pubDate = null;
		try {
			pubDate = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("pubDate"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Double price = Double.parseDouble(request.getParameter("price"));
		dao.add(new Book(isbn,title,author,pubDate,price));
		response.sendRedirect("adminbookcontroller.jsp");
	}

}
