package com.xworkz.app.dto;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BloodGroupDTO  implements Serializable, Comparable<BloodGroupDTO> {
	
	@Size(min=3,max=30, message  = "Person Name should be between 3 and 30")
	private String personName;
	@NotEmpty(message = "Group must be selected")
	private String group;
	@Min(value = 18, message = "Age should be greater than or equal to 18")
	@Max(value = 60, message = "Age should be less than 60")
	private int age;
	@NotEmpty
	@Size(min=3, max=30, message = "Address should be between 3 and 30")
	private String address;
	@Min(value=50, message = "Weight Should be more than 50")
	private double weight;
	
	
	
	@Override
	public int compareTo(BloodGroupDTO o) {
		// TODO Auto-generated method stub
		return personName.compareTo(o.getPersonName());
	}

}
