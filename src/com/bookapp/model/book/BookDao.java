package com.bookapp.model.book;

import java.util.*;

public interface BookDao {
	public List<Book> getAll();

	public Book add(Book book);

	public Book delete(int bookId);

	public Book update(Book book);

	public Book getById(int bookId);
}