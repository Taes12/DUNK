package com.springproject.dunk.hy.dao;

import java.util.List;

import com.springproject.dunk.hy.domain.Event;

public interface EventDao {

	public List<Event> eventList(int startRow, int num, String type, String keyword);	
	
	public int getEventCount(String type, String keyword);
	
}
