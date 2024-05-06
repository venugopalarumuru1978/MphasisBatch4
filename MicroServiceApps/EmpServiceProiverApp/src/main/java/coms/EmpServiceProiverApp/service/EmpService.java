package coms.EmpServiceProiverApp.service;

import java.util.List;

import coms.EmpServiceProiverApp.entities.Employee;

public interface EmpService {

	public void AddEmployee(Employee emp);
	public List<Employee> ShowAll();
	public Employee SearchEmployee(int empno);
	public void DeleteEmployee(int empno);
	public void UpdateEmployee(Employee emp);
}
