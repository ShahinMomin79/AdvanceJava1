package ManyTOMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class CustomersDTO {
	
	@Id
	private int id;
	private String Cname;
	private int ItemsQ;
	 
	@ManyToMany
	List<ProductsDTO> products;

}
