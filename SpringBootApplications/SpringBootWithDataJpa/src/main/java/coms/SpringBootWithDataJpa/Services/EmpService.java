package coms.SpringBootWithDataJpa.Services;

import java.util.List;

import coms.SpringBootWithDataJpa.models.Employee;

public interface EmpService {

	public void AddEmployee(Employee emp);
	public List<Employee>  ShowAll();
	public Employee SearchEmployee(int eno);
	public void DelEmployee(int eno);
	public void UpdateEmployee(Employee emp);
	
	public List<Employee>  ShowAllJobRelatedEmps(String job);
}
