package com.xworkz.app.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.dto.AdminDTO;
import com.xworkz.app.entity.AdminEntity;

@Repository
public class AdminRepositoryImpl implements AdminRepository{
	
	
	@Autowired
	EntityManagerFactory factoryy;

	 public AdminRepositoryImpl() {
		System.out.println("Admin repo  impl created");
	}
	 
	
	
	@Override
	public boolean saveInfo(AdminEntity entity) {
		System.out.println("inside saveInfo");
		EntityManager manager = factoryy.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		transaction.commit();
		manager.close();
		return true;
	}
	
	@Override
	public List<AdminDTO> findByLocation(String location) {
		System.out.println("running findByLocation in repo" +  location);

		EntityManager entityManager = factoryy.createEntityManager();
		Query query = entityManager.createNamedQuery("findByLocation");
		query.setParameter("ab", location);
		List<AdminDTO> result = query.getResultList();
		System.out.println("result from repo" + result);
		entityManager.close();
		return result;
	}


}
