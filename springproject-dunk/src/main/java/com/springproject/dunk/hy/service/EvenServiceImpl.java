package com.springproject.dunk.hy.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.dunk.hy.dao.EventDao;
import com.springproject.dunk.hy.domain.Event;

@Service
public class EvenServiceImpl implements EventService {
	
	private static final int PAGE_SIZE=10;
	
	private static final int PAGE_GROUP=10;
	
	private EventDao dao;
	
	@Autowired	
	public EvenServiceImpl(EventDao dao) {	
		this.dao = dao;
	}
	
	@Override
	public Map<String, Object> eventList(int pageNum, String type, String keyword) {	
		
		int startRow=(pageNum-1)*PAGE_SIZE;
		
		int listCount=0;
		
		listCount=dao.getEventCount(type, keyword);
		
		boolean searchOption=type.equals("null") || keyword.equals("null") ? false : true;
		
		List<Event> eventList=dao.eventList(startRow, PAGE_SIZE, type, keyword);
		
		int pageCount=listCount/PAGE_SIZE+(listCount%PAGE_SIZE==0  ? 0 : 1);
		
		int startPage=(pageNum/PAGE_GROUP)*PAGE_GROUP+1-(pageNum%PAGE_GROUP==0 ? PAGE_GROUP : 0);
		
		int endPage=startPage+PAGE_GROUP-1;
		
		if(pageCount<endPage) {
			endPage=pageCount;
		}
		
		Map<String, Object> modelMap=new HashMap<>();
		
		modelMap.put("eList", eventList);
		modelMap.put("pageNum", pageNum);
		modelMap.put("listCount", listCount);
		modelMap.put("pageCount", pageCount);
		modelMap.put("startPage", startPage);
		modelMap.put("endPage", endPage);
		modelMap.put("pageGroup", PAGE_GROUP);	
		modelMap.put("searchOption", searchOption);	
		
		if(searchOption) {
			modelMap.put("type", type);
			modelMap.put("keyword", keyword);
		}		
		
		return modelMap;
	}	

}
