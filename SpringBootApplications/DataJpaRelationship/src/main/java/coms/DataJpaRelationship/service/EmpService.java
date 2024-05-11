package coms.DataJpaRelationship.service;

import java.util.List;

import coms.DataJpaRelationship.entities.Employee;

public interface EmpService {

	public void AddEmployee(Employee emp);
	public List<Employee> ShowAll();
}
