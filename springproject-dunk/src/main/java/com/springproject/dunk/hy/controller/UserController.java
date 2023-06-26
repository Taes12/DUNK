package com.springproject.dunk.hy.controller;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.springproject.dunk.hy.domain.User;
import com.springproject.dunk.hy.service.UserService;

@Controller
public class UserController {	
	
	private UserService service;

	@Autowired
	public UserController(UserService service) {		
		this.service = service;		
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(String id, String pass, PrintWriter out, HttpServletResponse response, 
			HttpSession session, Model model) {
		
		int result=service.login(id, pass);
		
		if(result==-1) {
			response.setContentType("text/html; charset=utf-8");
			out.println("<script>");
			out.println("	alert('아이디가 존재하지 않습니다.');");
			out.println("	history.back();");
			out.println("</script>");
			
			return null;
			
		} else if(result==0) {
			response.setContentType("text/html; charset=utf-8");
			out.println("<script>");
			out.println("	alert('비밀번호가 틀렸습니다.');");
			out.println("	history.back();");
			out.println("</script>");	
			
			return null;		
		}
		
		User user=service.getUser(id);
		
		model.addAttribute("user", user);
		
		session.setAttribute("isLogin", true);
		session.setAttribute("id", id);
		session.setAttribute("nick", user.getNickname());
		
		return "redirect:eventList";	
		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:eventList";
	}	
	
}
