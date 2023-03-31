package com.xworkz.shoppingTask.service;

import com.xworkz.shoppingTask.DTO.ShoppingsDTO;

public interface Shoppinsservice {
	
	abstract boolean validateAndSave(ShoppingsDTO dto);
	abstract boolean readByEmail(String email);
	abstract boolean readByName(String name);
	abstract boolean readAll(ShoppingsDTO dto);
	abstract boolean updateById(int id);
	abstract boolean updateByName(String name);
	abstract boolean updateByEmail(String email);
	abstract boolean deleteById(int id);
	abstract boolean deleteByEmail(String email);
	

}
