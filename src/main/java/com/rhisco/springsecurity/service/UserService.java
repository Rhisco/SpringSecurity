package com.rhisco.springsecurity.service;

import com.rhisco.springsecurity.model.User;

public interface UserService {

	void save(User user);
	
	User findByIdUser(int id);
	
	User findByUsername(String id);
	
}