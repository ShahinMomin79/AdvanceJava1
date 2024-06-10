package OneToOneBirdirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Product {
      @Id
	  private int id;
	  private String Pname;
	  
	@OneToOne   
	private  Customer customer;
}
