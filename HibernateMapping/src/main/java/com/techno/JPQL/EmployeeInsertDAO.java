package com.techno.JPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsertDAO {
	 private static EntityManagerFactory factory;
	 private static EntityManager manager;
	 private static EntityTransaction transaction;
	 
	 private static void openConnection() {
			factory=Persistence.createEntityManagerFactory("HibernateMapping");
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
		public static void main(String[] args) {
			openConnection();
			transaction.begin();
			
			EmployeeDTO dto=new EmployeeDTO();
			dto.setId(2);
			dto.setName("rohan");
			dto.setSalary(35000);
			
			manager.persist(dto);
			transaction.commit();
			closeConnection();

}}
