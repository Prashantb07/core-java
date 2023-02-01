package com.xworkz.abbapp.factapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Bar {

	private int id;
	private String barName;
	private String location;
	private String ownerName;

	

	public Bar(int id, String barName, String location, String ownerName) {
		super();
		this.id = id;
		this.barName = barName;
		this.location = location;
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {

		return "Bar (Id = " + this.id + " , BarName=" + this.barName + " , Location = " + this.location
				+ " , OwnerName = " + this.ownerName + ")";
	}
}
