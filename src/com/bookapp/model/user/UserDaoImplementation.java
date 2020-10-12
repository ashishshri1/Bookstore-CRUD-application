package com.bookapp.model.user;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


@SuppressWarnings("deprecation")
public class UserDaoImplementation implements UserDao {
	SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
	Session session = factory.openSession();

	@Override
	public List<User> getAll() {
		@SuppressWarnings("unchecked")
		List<User> users = session.createQuery("select u from com.bookapp.model.user.User u").list();
		return users;
	}

	@Override
	public User add(User user) {
		Transaction tx = session.getTransaction();
		try {
			tx.begin();
			session.save(user);
			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		return user;
	}

	@Override
	public User delete(String username) {
		return null;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String username, String password) {
		Query query = session.createQuery("select u from com.bookapp.model.user.User u where u.username = :username and u.password = :password");
		query.setParameter("username",username);
		query.setParameter("password",password);
		@SuppressWarnings("unchecked")
		List<User> users = query.list();
		if(users.size()==1)
		return users.get(0);
		return null;
	}

	@Override
	public boolean containsUser(String username) {
		Query query = session.createQuery("select u from com.bookapp.model.user.User u where u.username=:username");
		query.setParameter("username",username);
		if(query.list().size()==1)
		return true;
		return false;
	}
}
