package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.models.Employee;
import com.services.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService es;
	
	@GetMapping("/newemp")
	public String NewEmp(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "AddEmployee";
	}
	
	@PostMapping("/empprocess")
	public String NewEmp(@ModelAttribute("emp") Employee emp, Model m)
	{
		System.out.println(emp.getEmpno() + "\t" + emp.getEname() + "\t" + emp.getJob() + "\t" + emp.getSalary());
		es.AddEmployee(emp);
		m.addAttribute("emp", new Employee());
		m.addAttribute("msg", "New Employee is Added...");
		return "redirect:/empall";
	}
	
	@GetMapping("/empall")
	public String ViewAllEmps(Model m)
	{
		List<Employee> emplist = es.ShowAll();
		m.addAttribute("emplist", emplist);
		return "EmpAll";
	}

	@GetMapping("/semp")
	public String SearchEmp(Model m)
	{
		return "SearchEmp";
	}
	
	@PostMapping("/search")
	public String SearchEmp(@RequestParam("txtEmpno") int eno, Model m)
	{
		Employee emp = es.SearchEmployee(eno);		
		if(emp==null)
			m.addAttribute("msg", "Emp Not Found");
			
		m.addAttribute("emp", emp);
		return "SearchEmp";
	}
	
	@GetMapping("/delemp/{eid}")
	public String DelEmp(@PathVariable("eid") int eid,  Model m)
	{
		es.DelEmployee(eid);
		return "redirect:/empall";
	}
	
	@GetMapping("/updateemp/{eid}")
	public String UpdateEmp(@PathVariable("eid") int eid, Model m)
	{
		Employee emp = es.SearchEmployee(eid);
		m.addAttribute("emp", emp);
		return "UpdateEmp";
	}
	@PostMapping("/empUpdate")
	public String UpdateEmp(@ModelAttribute("emp") Employee emp, Model m)
	{
		es.UpdateEmployee(emp);
		return "redirect:/empall";
	}
}
