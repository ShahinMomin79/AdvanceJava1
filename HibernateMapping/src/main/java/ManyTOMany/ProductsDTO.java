package ManyTOMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class ProductsDTO {
	
	@Id
	private int id;
	private String Pname;
	private double price;
	
	

}

//JPQl -- 