package ManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.Data;

@Data
@Entity
public class TeamDTO {
	@Id
     private int id;
     private String teamName;
     private String city;
     private String coach;
     
   
    
}
