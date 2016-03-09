package com.rhisco.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rhisco.springsecurity.dao.UserDao;
import com.rhisco.springsecurity.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public void save(User user){
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		dao.save(user);
	}
	
	@Override
	public User findByIdUser(int id) {
		return dao.findByIdUser(id);
	}

	@Override
	public User findByUsername(String id) {
		return dao.findByUsername(id);
	}
	
}
