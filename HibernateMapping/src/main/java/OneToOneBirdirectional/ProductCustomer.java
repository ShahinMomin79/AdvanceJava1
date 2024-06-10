package OneToOneBirdirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductCustomer {
	
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
		
		Product product=new Product();
		product.setId(1);
		product.setPname("shoes");
		
		Customer customer=new Customer();
		customer.setId(2);
		customer.setName("rohan");
		
		
		customer.setProduct(product);
		
		manager.persist(product);
		
		product.setCustomer(customer);
		manager.persist(customer);
		
		transaction.commit();
		closeConnection();
	}

}
