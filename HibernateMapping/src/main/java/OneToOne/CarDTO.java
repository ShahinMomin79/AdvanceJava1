package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class CarDTO {
	
	@Id
	private int regno;
	private String color;
	private String brand;
	
	@OneToOne
	private DriverDTO driver;

}

