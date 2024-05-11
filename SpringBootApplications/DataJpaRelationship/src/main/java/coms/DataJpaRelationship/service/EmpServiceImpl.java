package coms.DataJpaRelationship.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.DataJpaRelationship.entities.Employee;
import coms.DataJpaRelationship.repo.EmpRepository;

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

}
