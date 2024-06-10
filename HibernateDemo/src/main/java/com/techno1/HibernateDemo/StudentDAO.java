package com.techno1.HibernateDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDAO {
	  private static EntityManagerFactory factory;
	  private static EntityManager manager;
	  private static EntityTransaction transaction;
	
	public static void main(String[] args) {
		factory=Persistence.createEntityManagerFactory("HibernateDemo");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
		transaction.begin();
		StudentDTO student=new StudentDTO();
		student.setId(5);
		student.setName("sayyed");
		student.setCity("mumbai");
		
		manager.persist(student);
		transaction.commit();
		
		if(factory!=null) {
			factory.close();
		}
		if (manager!=null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
		
		//CRUD -- create read/retrive update delete
	}

}
