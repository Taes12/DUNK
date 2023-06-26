package com.springproject.dunk.hy.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproject.dunk.hy.domain.Event;

@Repository
public class EventDaoImpl implements EventDao {

	private final String NAME_SPACE="com.springproject.dunk.mapper.EventMapper";
	
	private SqlSessionTemplate sqlSession;

	@Autowired
	public EventDaoImpl(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Event> eventList(int startRow, int num, String type, String keyword) {	
		
		Map<String, Object> params=new HashMap<>();
		
		params.put("startRow", startRow);
		params.put("num", num);
		params.put("type", type);
		params.put("keyword", keyword);
		
		return sqlSession.selectList(NAME_SPACE+".eventList", params);
	}
	
	@Override
	public int getEventCount(String type, String keyword) {		
		
		Map<String, Object> params=new HashMap<>();
		
		params.put("type", type);
		params.put("keyword", keyword);
		
		return sqlSession.selectOne(NAME_SPACE+".getEventCount", params);	
	}
		
}
