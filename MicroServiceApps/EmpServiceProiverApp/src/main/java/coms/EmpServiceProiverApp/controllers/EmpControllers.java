package coms.EmpServiceProiverApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coms.EmpServiceProiverApp.entities.Employee;
import coms.EmpServiceProiverApp.service.EmpService;

@RestController
@RequestMapping("/emp_provider")
public class EmpControllers {

	@Autowired
	EmpService es;
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> ShowAllEmps()
	{
		return new ResponseEntity<List<Employee>>(es.ShowAll(), HttpStatus.OK);
	}
	
	@GetMapping("/employee/{eid}")
	public ResponseEntity<Object> SearchEmp(@PathVariable int eid)
	{
		Employee emp = es.SearchEmployee(eid);
		
		if(emp!=null)
			return new ResponseEntity<Object>(emp, HttpStatus.OK);
		
		return new ResponseEntity<Object>("Emp Not Found", HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Object> AddNewEmployee(@RequestBody Employee emp)
	{
		es.AddEmployee(emp);
		return new ResponseEntity<Object>("New Emp Added...", HttpStatus.OK);
	}
	

	@DeleteMapping("/employee/{eid}")
	public ResponseEntity<Object> DeleteEmp(@PathVariable int eid)
	{
		Employee emp = null;
		if(es.SearchEmployee(eid)!=null)
		{
			es.DeleteEmployee(eid);
			return new ResponseEntity<Object>("Employee Deleted", HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Emp Not Found", HttpStatus.NOT_FOUND);
	}

	@PutMapping("/employee/{eid}")
	public ResponseEntity<Object> ModifyEmp(@PathVariable int eid, @RequestBody Employee emp)
	{
		if(es.SearchEmployee(eid)!=null)
		{
			es.UpdateEmployee(emp);
			return new ResponseEntity<Object>("Employee Modified", HttpStatus.OK);
		}
		return new ResponseEntity<Object>("Emp Not Found", HttpStatus.NOT_FOUND);
	}
}
