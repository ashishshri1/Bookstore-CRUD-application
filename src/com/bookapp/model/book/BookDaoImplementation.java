package com.bookapp.model.book;

import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.*;

public class BookDaoImplementation implements BookDao {
	@SuppressWarnings("deprecation")
	SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
	Session session = factory.openSession();

	@Override
	public List<Book> getAll() {
		@SuppressWarnings("unchecked")
		List<Book> books = session.createQuery("select b from com.bookapp.model.book.Book b").list();
		return books;
	}

	@Override
	public Book add(Book book) {
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(book);
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		return book;
	}

	@Override
	public Book delete(int bookId) {
		Transaction tx = session.getTransaction();
		Book book = null;
		try {
			tx.begin();
			book = getById(bookId);
			session.delete(book);
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		return book;
	}

	@Override
	public Book update(Book book) {
		Transaction tx = session.getTransaction();
		Book bookdb = (Book) session.get(Book.class, book.getId());
		try {
			tx.begin();
			bookdb.setPrice(book.getPrice());
			session.update(bookdb);
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		return book;
	}

	@Override
	public Book getById(int bookId) {
		Query query = session.createQuery("select b from com.bookapp.model.book.Book b where b.id = :id");
		query.setParameter("id", bookId);
		@SuppressWarnings("unchecked")
		List<Book> books = query.list();
		return books.get(0);
	}
}