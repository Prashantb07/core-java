package com.xworkz.app.dto;


import lombok.AllArgsConstructor;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class ParkingDTO {
	
	
	private int id;
	private String name;
	private String email;
	private String password;
	private String loginTime;	
	
	
	
	
	public ParkingDTO() {
		log.info("Created: " +getClass().getSimpleName());
	}
	
}
