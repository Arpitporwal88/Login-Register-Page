package com.talent.Dao;

public interface UserDao {
	//boolean addUser(User user);
	boolean isValidUser(String username, String password);

	boolean addUser(User user);
	
}
