package coms.SpringBootWithDataJpa.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.SpringBootWithDataJpa.models.Employee;
import coms.SpringBootWithDataJpa.repo.EmpRepository;

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
	public Employee SearchEmployee(int eno) {

		Optional<Employee>  emp = er.findById(eno);
		if(emp.isPresent())
			return emp.get();
		return null;
	}

	@Override
	public void DelEmployee(int eno) {
		
		er.deleteById(eno);
		
	}

	@Override
	public void UpdateEmployee(Employee emp) {
		
		er.saveAndFlush(emp);
	}
}
