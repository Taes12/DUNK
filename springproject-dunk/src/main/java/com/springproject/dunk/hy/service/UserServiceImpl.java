package com.springproject.dunk.hy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springproject.dunk.hy.dao.UserDao;
import com.springproject.dunk.hy.domain.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDao dao;
	
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	public UserServiceImpl(UserDao dao, BCryptPasswordEncoder passwordEncoder) {		
		this.dao = dao;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public int login(String id, String pass) {
		
		User u=dao.getUser(id);
		
		int result=-1;
		
		if(u==null) {
			return result;
		}
		
		if(passwordEncoder.matches(pass, u.getPass())) {
			result=1;
			
		} else {
			result=0;
		}
		
		return result;
	}

	@Override
	public User getUser(String id) {		
		return dao.getUser(id);
	}	
	
}
