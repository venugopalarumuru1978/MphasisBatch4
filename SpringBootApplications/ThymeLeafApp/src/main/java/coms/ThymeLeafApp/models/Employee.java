package coms.ThymeLeafApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="emptest_info")
@Getter
@Setter
public class Employee {
	@Id
	@GeneratedValue
	private int empno;
	
	private String ename;
	private String job;
	private float salary;
}
