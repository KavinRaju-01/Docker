package com.example.demo.controller;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class Controller {
	
	@GetMapping("/")
	public String greet(HttpServletRequest request)
	{
		return "Good Morning !!!!!!!!!!!"+request.getSession().getId();
	}
	@GetMapping("/kavin")
	public CsrfToken getToken(HttpServletRequest demo)
	{
		
		 return (CsrfToken) demo.getAttribute("_csrf");
	}

	
	
	
	
	
	
	

}
