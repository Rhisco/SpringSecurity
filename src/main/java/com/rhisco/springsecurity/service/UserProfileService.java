package com.rhisco.springsecurity.service;

import java.util.List;

import com.rhisco.springsecurity.model.UserProfile;

public interface UserProfileService {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
