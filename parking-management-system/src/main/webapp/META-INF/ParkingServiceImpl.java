package com.xworkz.app.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.dto.ParkingDTO;
import com.xworkz.app.entity.ParkingEntity;
import com.xworkz.app.repo.ParkingRepository;

@Service
public class ParkingServiceImpl  implements ParkingService{
	
	@Autowired
	ParkingRepository repo;

	public ParkingServiceImpl() {
		System.out.println("created parking service impl");
	}
	
	
	@Override
	public ParkingDTO userSignIn(String email, String password) {
		System.out.println(email);
		ParkingEntity entity = repo.userSignIn(email);
		
		if (entity.getEmail().equals(email) && entity.getPassword().equals(password)) {
			
			SimpleDateFormat dateFormate = new SimpleDateFormat("dd/mm/yyyy,hh:mm");
			String formateDate = dateFormate.format(new Date()).toString();
			
			entity.setLogintime(formateDate);
			boolean status = repo.updateTime(entity);
			ParkingDTO dto = new ParkingDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		
		return null;
		
	}

	
}
