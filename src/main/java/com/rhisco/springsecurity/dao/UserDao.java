package com.rhisco.springsecurity.dao;

import com.rhisco.springsecurity.model.User;

public interface UserDao 
{

	void save(User user);
	
	User findByIdUser(int id);
	
	User findByUsername(String id);
	
}

