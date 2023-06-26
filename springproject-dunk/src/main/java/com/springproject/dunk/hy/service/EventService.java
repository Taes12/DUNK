package com.springproject.dunk.hy.service;

import java.util.List;
import java.util.Map;

public interface EventService {

	public Map<String, Object> eventList(int pageNum, String type, String keyword);	
	
}
