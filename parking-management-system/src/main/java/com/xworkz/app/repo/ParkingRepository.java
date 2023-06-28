package com.xworkz.app.repo;

import com.xworkz.app.entity.ParkingEntity;

public interface ParkingRepository {

	ParkingEntity userSignIn(String email);

	boolean updateTime(ParkingEntity entity);
	
	

}
