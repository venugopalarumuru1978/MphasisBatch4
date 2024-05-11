package coms.DataJpaRelationship.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import coms.DataJpaRelationship.entities.Employee;
import coms.DataJpaRelationship.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService es;
	
	@GetMapping("/newemp")
	public String NewEmployee(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "AddEmp";
	}
	
	@PostMapping("/empprocess")
	public String NewEmployee(@ModelAttribute("emp") Employee emp, Model m)
	{
		System.out.println(emp.getEname());
		System.out.println(emp.getAdrs().getHouseno());
		System.out.println(emp.getAdrs().getLocation());
		es.AddEmployee(emp);
		m.addAttribute("emp", new Employee());		
		return "AddEmp";
	}
	
	@GetMapping("/empall")
	public String ShowAllEmps(Model m)
	{
		List<Employee>  emplist = es.ShowAll();
		m.addAttribute("emplist", emplist);
		return "ShowAllEmp";
	}
}
