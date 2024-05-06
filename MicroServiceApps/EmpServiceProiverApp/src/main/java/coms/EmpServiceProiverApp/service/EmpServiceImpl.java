package coms.EmpServiceProiverApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.EmpServiceProiverApp.entities.Employee;
import coms.EmpServiceProiverApp.repo.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpRepository er;
	
	@Override
	public void AddEmployee(Employee emp) {
		er.save(emp);
	}

	@Override
	public List<Employee> ShowAll() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public Employee SearchEmployee(int empno) {
		Optional<Employee>  emp = er.findById(empno);
		if(emp.isPresent())
			return emp.get();
		
		return null;
	}

	@Override
	public void DeleteEmployee(int empno) {
		er.deleteById(empno);	
	}

	@Override
	public void UpdateEmployee(Employee emp) {
		er.saveAndFlush(emp);
	}
	
}
