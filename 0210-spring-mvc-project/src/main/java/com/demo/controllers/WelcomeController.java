package com.demo.controllers;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {
	
	@GetMapping("/")
	public String welcome(Model model) {
		
		model.addAttribute("companyName", "Sunbeam Infotech");		
		return "index";
	}

}
