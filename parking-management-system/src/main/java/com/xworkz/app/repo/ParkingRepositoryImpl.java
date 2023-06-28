package com.xworkz.app.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.app.entity.ParkingEntity;

@Repository
public class ParkingRepositoryImpl implements ParkingRepository {
	
	@Autowired
	EntityManagerFactory factory;

	public ParkingRepositoryImpl() {
		System.out.println("repo  impl created");
	}
	
	
	@Override
	public ParkingEntity userSignIn(String email) {
		System.out.println("Parking entity repo created");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("email", email);
		Object object = query.getSingleResult();
		ParkingEntity entity = (ParkingEntity) object;
		return entity;
		
	}
	
	
	@Override
	public boolean updateTime(ParkingEntity entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		transaction.commit();
		manager.close();
		return false;
	}
	

}
