package com.xworkz.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name="parkinginfo")


public class AdminEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String Location;
	private String VechicalType;
	private String VechicalClassification;
	private String terms;
	private String price;
	private String  discount;
	
	
	
	public AdminEntity() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

}
