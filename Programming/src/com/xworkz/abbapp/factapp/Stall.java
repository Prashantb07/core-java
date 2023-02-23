package com.xworkz.abbapp.factapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Stall {
	
	@Getter
	@Setter
	//@AllArgsConstructor
	//@NoArgsConstructor
	
	private int id;
	private String barName;
	private String location;
	private String ownerName;

	
	public Stall() {
		
	}
	
	public boolean Stall () {
		return false;
		
	}
	
		
		@Override
		public String toString() {
			return barName ;
		}
		


	

}
