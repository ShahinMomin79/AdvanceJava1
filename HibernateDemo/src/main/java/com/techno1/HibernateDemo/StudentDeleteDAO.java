package com.techno1.HibernateDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDeleteDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		factory=Persistence.createEntityManagerFactory("HibernateDemo");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}
	
	private static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if (manager!=null) {
			manager.close();
		}
		if (transaction.isActive()) {
			transaction.rollback();
		}
	}
//	public static void main(String[] args) {
//		openConnection();
//		transaction.begin();
//	
//	
//	manager.remove(manager.find(StudentDTO.class, 4));
//	 
//	 transaction.commit();
//	 closeConnection();
//	}
	
	public static void main(String[] args) {
		 openConnection();
		 transaction.begin();
	  StudentDTO student= manager.find(StudentDTO.class, 2);
		manager.remove(student);
		
		
		transaction.commit();
		closeConnection();
		
		
	}

}
