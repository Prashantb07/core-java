package com.xworkz.app.repo;

import java.util.List;

import com.xworkz.app.dto.AdminDTO;
import com.xworkz.app.entity.AdminEntity;

public interface AdminRepository {

	boolean saveInfo(AdminEntity entity);
	
	List<AdminDTO> findByLocation(String location);
}
