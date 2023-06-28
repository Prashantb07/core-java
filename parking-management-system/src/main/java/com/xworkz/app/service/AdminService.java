package com.xworkz.app.service;

import java.util.List;

import com.xworkz.app.dto.AdminDTO;

public interface AdminService {

	boolean validateAndSave(AdminDTO dto);

	List<AdminDTO> findByLocation(String location);
}
