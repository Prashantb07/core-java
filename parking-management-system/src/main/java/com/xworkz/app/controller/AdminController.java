package com.xworkz.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.xworkz.app.dto.AdminDTO;
import com.xworkz.app.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService service;

	public AdminController() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	
	@PostMapping("savePI")
	public String OnSave(@Valid AdminDTO dto, Model model, BindingResult bindingResult) {
	System.out.println("inside OnSave method");
	model.addAttribute("dto", dto);
	
	if(bindingResult.hasErrors()) {
		System.out.println("data is invalid");
		model.addAttribute("errors", bindingResult.getAllErrors());
		model.addAttribute("dto", dto);
		return "/informationpage.jsp";

	}else {
		System.out.println("data is valid");
//		service.
		model.addAttribute("msg", "Admin save successsfully");
	}
		return "/response.jsp";
		
	}
	
	@GetMapping("/search")
	public String ShowData(Model model,String location) {
		System.out.println("running search method");
		List<AdminDTO> list = service.findByLocation(location);
		//model.addAttribute("dtos",this.dtos);
		model.addAttribute("list",list);

		return "/View.jsp";
	}

}
