package ManyTOMany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductsCustomersDAO {
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
			
			ProductsDTO product1=new ProductsDTO();
			product1.setId(1);
			product1.setPname("shoes");
			product1.setPrice(10000);
			manager.persist(product1);
			
			ProductsDTO product2=new ProductsDTO();
			product2.setId(2);
			product2.setPname("watch");
			product2.setPrice(30000);
			manager.persist(product2);
			
			ProductsDTO product3=new ProductsDTO();
			product3.setId(3);
			product3.setPname("wallet");
			product3.setPrice(800);
			manager.persist(product3);
			
//			List<ProductsDTO> products=Arrays.asList(product1,product2,product3);
			
			 List<ProductsDTO> pro1=Arrays.asList(product1,product2);
			 List<ProductsDTO> pro2=Arrays.asList(product1,product3);
			 
			CustomersDTO customer1=new CustomersDTO();
			customer1.setId(1);
			customer1.setCname("rohan");
			customer1.setItemsQ(3);
			customer1.setProducts(pro1);
			manager.persist(customer1);
			
			CustomersDTO customer2=new CustomersDTO();
			customer2.setId(2);
			customer2.setCname("vitthal");
			customer2.setItemsQ(3);
			customer2.setProducts(pro2);
			manager.persist(customer2);
			
			transaction.commit();
			closeConnection();
		}

}
