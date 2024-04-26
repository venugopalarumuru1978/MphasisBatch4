package coms.SpringBootWithDataJpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import coms.SpringBootWithDataJpa.Services.EmpService;
import coms.SpringBootWithDataJpa.models.Employee;

@Controller
public class EmpController {

	@Autowired
	EmpService es;
	
	@GetMapping("/")
	public String AddEmployees(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "AddEmp";
	}

	@GetMapping("/newemp")
	public String AddEmployee(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "AddEmp";
	}
	
	@PostMapping("/empprocess")
	public String AddEmployee(@ModelAttribute("emp") Employee emp, Model m)
	{
		es.AddEmployee(emp);
		m.addAttribute("emp", new Employee());
		m.addAttribute("msg", "Emp Added..");
		return "AddEmp";
	}
}
