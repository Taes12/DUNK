package com.springproject.dunk.hy.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springproject.dunk.hy.service.EventService;

@Controller
public class EventController {	
	
	private EventService service;
	
	@Autowired
	public EventController(EventService service) {	
		this.service = service;
	}
	
	@RequestMapping("/eventList")
	public String eventList(Model model, 
			@RequestParam(value="pageNum", required=false, defaultValue="1") int pageNum, 
			@RequestParam(value="type", required=false, defaultValue="null") String type, 
			@RequestParam(value="keyword", required=false, defaultValue="null") String keyword) {
				
		Map<String, Object> modelMap=service.eventList(pageNum, type, keyword);
		
		model.addAllAttributes(modelMap);
				
		return "event/eventList";
	}
		
	
}
