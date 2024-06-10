package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarDriverDAO {
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
	
	//for uniirectonal mapping ONETOONE
//	public static void main(String[] args) {
//		openConnection();
//		transaction.begin();
//		
//		DriverDTO driver=new DriverDTO();
//		driver.setId(2);
//		driver.setName("rahul");
//		driver.setContact(9037659292l);
//		manager.persist(driver);
//		
//		CarDTO car=new CarDTO();
//		car.setRegno(42);
//		car.setBrand("brezza");
//		car.setColor("white");
//		car.setDriver(driver);
//		manager.persist(car);
//		
//		transaction.commit();
//		closeConnection();
//	}
	
	//for Bidirectional Mapping ONETOONE
	public static void main(String[] args) {
		openConnection();
		transaction.begin();
		
		DriverDTO driver=new DriverDTO();
		driver.setId(5);
		driver.setName("ravi");
		driver.setContact(9033759292l);
		
		CarDTO car=new CarDTO();
		car.setRegno(56);
		car.setBrand("toyoto1");
		car.setColor("black");
		
		driver.setCar(car);
		manager.persist(driver);
		
		car.setDriver(driver);
		manager.persist(car);
		
		
		
		transaction.commit();
		closeConnection();
	}

}

