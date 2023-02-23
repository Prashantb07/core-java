package com.dev.devapp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Bar {
	
	
	    public Bar() {
			// TODO Auto-generated constructor stub
		}

	private int id;
	private String barName;
	private String location;
	private String ownerName;

	@Override
	public String toString() {

		return "Bar (Id = " + this.id + " , BarName=" + this.barName + " , Location = " + this.location
				+ " , OwnerName = " + this.ownerName + ")";
	}

	@Override
	public boolean equals(Object obj) {
		// downCasting
		Bar bar = (Bar) obj;

		if (this.ownerName.equals(bar.ownerName) && this.barName.equals(bar.barName)
				|| this.location.equals(bar.location) || this.id == bar.id) {
			// if(this.id==bar.id) {
			return true;
		} else {
			return false;
		}

	}
}
