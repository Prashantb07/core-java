package com.xworkz.app.service;

import com.xworkz.app.dto.ParkingDTO;

public interface ParkingService {

	ParkingDTO userSignIn(String email, String password);

}
