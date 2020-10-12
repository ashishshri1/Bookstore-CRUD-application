package com.bookapp.model.user;

import java.util.*;

public interface UserDao {
	public List<User> getAll();

	public User add(User user);

	public User delete(String username);

	public User update(User user);

	public User getUser(String username, String password);
	
	public boolean containsUser(String username);
}
