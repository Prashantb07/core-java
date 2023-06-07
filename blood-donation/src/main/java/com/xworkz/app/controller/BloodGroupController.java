package com.xworkz.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.app.dto.BloodGroupDTO;

@Component
@RequestMapping("/donate")

public class BloodGroupController {

	public BloodGroupController(){
		System.out.println("created" + this.getClass().getSimpleName());
	}
	
	@PostMapping	
	public String onDonate(@Valid BloodGroupDTO dto, BindingResult bindingResult, Model model) {
		System.out.println("running on donate" + dto);
		if (bindingResult.hasErrors()) {
			System.err.println("Data is invalid");
			List<ObjectError> errors = bindingResult.getAllErrors();
			errors.forEach(ob -> System.err.println(ob.getDefaultMessage()));
			model.addAttribute("errors", errors);
			
		}else {
			System.out.println("Data is valid");
			model.addAttribute("successMsg", "Blood Group of " + dto.getPersonName() + "saved successfully....");
		}
		return "/BloodGroup.jsp";
	}
	
}

