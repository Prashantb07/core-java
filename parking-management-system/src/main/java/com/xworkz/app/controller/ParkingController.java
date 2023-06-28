package com.xworkz.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.cj.Session;
import com.xworkz.app.dto.ParkingDTO;
import com.xworkz.app.service.ParkingService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequestMapping("/")

public class ParkingController {

	@Autowired
	private ParkingService service;
	
	public ParkingController() {
		log.info("Created" + this.getClass().getSimpleName());
	}
	
	
	@PostMapping("/admin")
	public String onHome(String email, String password, Model model,HttpServletRequest req) {
		System.out.println(email);
		System.out.println("this is inside onHome method");
		
		ParkingDTO dto2 = service.userSignIn(email, password);
		if (dto2 != null) {
			System.out.println(dto2);
			HttpSession session=req.getSession(true);
			session.setAttribute("dto", dto2);
//			model.addAttribute("name", dto2.getUsername());
//			model.addAttribute("time", dto2.getLogintime());
//			model.addAttribute("email", dto2.getEmail());
				return "/Adminpage.jsp";
				
		}else {
			return "/loginpage.jsp";
		}
	
	}
	
}
