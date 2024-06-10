package com.techno.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDAO {
	
	 private static EntityManagerFactory entityManagerFactory;
	 private static EntityManager entityManager;
	 private static EntityTransaction entityTransaction;
	 
	public static void main(String[] args) {
		
		entityManagerFactory=Persistence.createEntityManagerFactory("Hibernate");
	  entityManager=entityManagerFactory.createEntityManager();
	  entityTransaction=entityManager.getTransaction();
	  entityTransaction.begin();
	  EmployeeDTO dto=new EmployeeDTO();
	  dto.setId(2);
	  dto.setName("mini");
	  
	  entityManager.persist(dto);
	  entityTransaction.commit();
	  if (entityManagerFactory!=null) {
		entityManagerFactory.close();
	}
	  if (entityManager!=null) {
		entityManager.close();
	}
	  if (entityTransaction.isActive()) {
		entityTransaction.rollback();
	}
		
	}

}
