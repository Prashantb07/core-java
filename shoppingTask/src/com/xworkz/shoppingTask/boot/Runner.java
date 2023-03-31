package com.xworkz.shoppingTask.boot;

import com.xworkz.shoppingTask.DTO.ShoppingsDTO;
import com.xworkz.shoppingTask.repo.Shoppingsrepo;
import com.xworkz.shoppingTask.repo.ShoppingsrepoImpl;
import com.xworkz.shoppingTask.service.ShoppingserviceImpl;
import com.xworkz.shoppingTask.service.Shoppinsservice;

public class Runner {
	
	public static void main(String[] args) {
		
ShoppingsDTO dto=new ShoppingsDTO(5, "Easybuy", "easybuy@gmail.com");

		Shoppingsrepo repository=new ShoppingsrepoImpl();
		ShoppingserviceImpl service=new ShoppingserviceImpl(repository);
		service.validateAndSave(dto);
		service.readByEmail("max@gmail.com");
		service.readByName("Easybuy");
		service.readAll(dto);
		service.updateById(2);
		service.updateByName("Justbake");
		service.updateByEmail("max@gmail.com");
		service.deleteById(4);
		service.deleteByEmail("naturals@gmail.com");		
	}

}
 