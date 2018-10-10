package com.eg.sjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



public interface UserDao {

	public User createUser(User user);
	public List<User> findAll();
	public User findUserById(int id);	
}


