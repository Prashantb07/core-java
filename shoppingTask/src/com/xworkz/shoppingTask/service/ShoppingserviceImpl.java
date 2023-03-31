package com.xworkz.shoppingTask.service;

 import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.shoppingTask.DTO.ShoppingsDTO;
import com.xworkz.shoppingTask.repo.Shoppingsrepo;

public class ShoppingserviceImpl  implements Shoppinsservice{

Shoppingsrepo shoppingsrepo;
	
	public ShoppingserviceImpl() {
		System.out.println("ShoppingServiceImplementation");
	}
	
	public ShoppingserviceImpl(Shoppingsrepo shoppingsrepo) {
		this.shoppingsrepo=shoppingsrepo;
	}
	
	@Override
	public boolean validateAndSave(ShoppingsDTO dto) {
		System.out.println("This is valiateAndsave");
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator valid=factory.getValidator();
		Set<ConstraintViolation<ShoppingsDTO>> violationMessages=valid.validate(dto);
		if(violationMessages.isEmpty()) {
			boolean save=this.shoppingsrepo.onSave(dto);
			System.out.println(save);
		}
		return true;
	}

	@Override
	public boolean readByEmail(String email) {
		if(email!=null) {
			System.out.println("Read by Email");
			boolean read=this.shoppingsrepo.readByEmail(email);
			System.out.println(read);
		}
		return true;
	}

	@Override
	public boolean readByName(String name) {
		if(name!=null) {
			System.out.println("Read by Name");
			boolean read=this.shoppingsrepo.readByName(name);
			System.out.println(read);
		}
		return true;
	}

	@Override
	public boolean readAll(ShoppingsDTO dto) {
		if(dto!=null) {
			System.out.println("Read All");
			boolean read=this.shoppingsrepo.readAll(dto);
			System.out.println(read);
		}
		return true;
	}

	@Override
	public boolean updateById(int id) {
		if(id!=0) {
			System.out.println("Update by Id");
			boolean update=this.shoppingsrepo.updateById(id);
			System.out.println(update);
		}
		return true;
	}

	@Override
	public boolean updateByName(String name) {
		if(name!=null) {
			System.out.println("Update by name");
			boolean update=this.shoppingsrepo.updateByName(name);
			System.out.println(update);
		}
		return true;
	}

	@Override
	public boolean updateByEmail(String email) {
		if(email!=null) {
			System.out.println("Update by Email");
			boolean update=this.shoppingsrepo.updateByEmail(email);
			System.out.println(update);
		}
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		if(id!=0) {
			System.out.println("Delete by Id");
			boolean delete=this.shoppingsrepo.deleteById(id);
			System.out.println(delete);
		}
		return true;
	}

	@Override
	public boolean deleteByEmail(String email) {
		if(email!=null) {
			System.out.println("Delete by Email");
			boolean delete=this.shoppingsrepo.deleteByEmail(email);
			System.out.println(delete);
		}
		return true;
	}
	

}
