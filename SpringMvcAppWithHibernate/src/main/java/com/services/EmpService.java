package com.services;

import java.util.List;

import com.models.Employee;

public interface EmpService {
	public void AddEmployee(Employee emp);
	public List<Employee>  ShowAll();
	public Employee SearchEmployee(int eno);
	public void DelEmployee(int eno);
	public void UpdateEmployee(Employee emp);
}
