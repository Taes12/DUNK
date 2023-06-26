package com.springproject.dunk.hy.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproject.dunk.hy.domain.User;

@Repository
public class UserDaoImpl implements UserDao {

	private final String NAME_SPACE="com.springproject.dunk.mapper.UserMapper";
	
	private SqlSessionTemplate sqlSession;

	@Autowired
	public UserDaoImpl(SqlSessionTemplate sqlSession) {		
		this.sqlSession = sqlSession;
	}

	@Override
	public User getUser(String id) {		
		return sqlSession.selectOne(NAME_SPACE+".getUser", id);
	}	
	
}
