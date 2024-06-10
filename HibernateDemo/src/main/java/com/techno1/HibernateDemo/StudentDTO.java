package com.techno1.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class StudentDTO {
	
	@Id
	private int id;
	private String name;
	private String city;
    	
	
	
	
	
}


