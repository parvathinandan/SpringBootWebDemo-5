package info.inetsolv.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "EMPLOYEE")
public @Data class Employee {

	@Id
	private Integer eno;
	private String name;
	private Double salary;

	
}
