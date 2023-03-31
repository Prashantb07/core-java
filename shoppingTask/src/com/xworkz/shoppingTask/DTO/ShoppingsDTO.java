package com.xworkz.shoppingTask.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ShoppingsDTO {
	
	public ShoppingsDTO() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	@NotBlank
	@NotEmpty
	@NotNull
	@Size(min=2,max=16)
	private String name;
	private String email;

}
