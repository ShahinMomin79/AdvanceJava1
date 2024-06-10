package OneToOneBirdirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Customer {
    @Id
	private int id;
    private String name;
    
    @OneToOne
    private Product product;
	

}
