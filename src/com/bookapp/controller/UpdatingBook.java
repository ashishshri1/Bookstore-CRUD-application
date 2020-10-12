package com.bookapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bookapp.model.book.*;
public class UpdatingBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDao dao=new BookDaoImplementation();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer bookId=Integer.parseInt(request.getParameter("selectbook"));
		Book book=dao.getById(bookId);
		book.setPrice(Double.parseDouble(request.getParameter("updatedPrice")));
		dao.update(book);
		response.sendRedirect("adminbookcontroller.jsp");
	}

}
