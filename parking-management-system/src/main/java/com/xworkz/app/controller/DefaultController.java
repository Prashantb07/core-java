package com.xworkz.app.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.app.dto.ParkingDTO;

@Component
@RequestMapping("/")

public class DefaultController {
	
	
	public DefaultController() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@GetMapping("/start")
	public String onStart(Model model) {
		model.addAttribute("dto", new ParkingDTO());
		return "/Homepage.jsp";
		
	}
	
	

}
