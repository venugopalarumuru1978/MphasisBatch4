package coms.ThymeLeafApp.service;

import java.util.List;

import coms.ThymeLeafApp.models.Employee;

public interface EmpService {

	public void AddEmployee(Employee emp);
	public List<Employee>  ShowAll();
	public Employee SearchEmployee(int eno);
	public void DelEmployee(int eno);
	public void UpdateEmployee(Employee emp);
	
	public List<Employee>  ShowAllJobRelatedEmps(String job);
}
