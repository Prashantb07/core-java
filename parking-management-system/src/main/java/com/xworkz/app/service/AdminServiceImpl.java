package com.xworkz.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.app.dto.AdminDTO;
import com.xworkz.app.entity.AdminEntity;
import com.xworkz.app.repo.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository repo;

	public AdminServiceImpl() {

		System.out.println("created Admin service impl");
	}

	@Override
	public boolean validateAndSave(AdminDTO dto) {

		AdminEntity entity = new AdminEntity();
		BeanUtils.copyProperties(dto, entity);
		repo.saveInfo(entity);
		return true;
	}

	@Override
	public List<AdminDTO> findByLocation(String location) {
		System.out.println("running findByLocation");

		List<AdminDTO> entities = this.repo.findByLocation(location);

		List<AdminDTO> dtos = entities.stream().map(ent -> {
			AdminDTO dto = new AdminDTO();
			BeanUtils.copyProperties(ent, dto);
			return dto;
		}).collect(Collectors.toList());

		return dtos;
	}

}
