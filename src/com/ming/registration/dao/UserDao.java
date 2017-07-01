package com.ming.registration.dao;

import java.util.List;

import com.ming.registration.model.User;

public interface UserDao {
	public void save(User u);
	public boolean checkUserExistsWithName(String username);  
	public List<User> getUsers();
	public User loadById(int id);
}
