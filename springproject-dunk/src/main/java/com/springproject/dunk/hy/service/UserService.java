package com.springproject.dunk.hy.service;

import java.util.List;

import com.springproject.dunk.hy.domain.User;

public interface UserService {
	
	public int login(String id, String pass);

	public User getUser(String id);	

}
