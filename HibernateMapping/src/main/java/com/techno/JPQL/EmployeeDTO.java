package com.techno.JPQL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class EmployeeDTO {
	
	@Id
	@Column(name="eid")
	private int id;
	private String name;
	private double salary;

}
