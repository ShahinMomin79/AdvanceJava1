package ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

@Data
@Entity
public class PlayersDTO {
	
	@Id
	 private int id;
	 private String Pname;
	 private int jerseyNo;
	 private String role;
	 
	 @ManyToOne
	 TeamDTO team;

}

