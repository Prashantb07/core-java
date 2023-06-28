package com.xworkz.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Entity
@Slf4j
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name="parkinginfo")
@NamedQueries({
@NamedQuery(name="findAll",query = "select pp from ParkingEntity pp"),
@NamedQuery(name="findByEmail",query = "select pp from ParkingEntity pp where pp.email=:email")

})

public class ParkingEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min = 3, max = 30, message = "name must and should be greater then 3 and less then 30")
	private String name;
	private String email;
	private String password;
	private String logintime;
	private String logindate;

	public ParkingEntity() {
		log.info("Created: "+getClass().getSimpleName());
	}
	
	
}
