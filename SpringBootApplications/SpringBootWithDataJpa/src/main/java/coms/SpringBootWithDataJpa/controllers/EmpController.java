package coms.SpringBootWithDataJpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		return "redirect:/empall";
	}
	
	@GetMapping("/empall")
	public String ViewAll(Model m)
	{
		List<Employee> emplist = es.ShowAll();
		m.addAttribute("emplist", emplist);
		return "ShowAllEmps";
	}
	
	@GetMapping("/search")
	public String SearchEmpPage(Model m)
	{
		return "SearchEmp";
	}
	
	@PostMapping("/semp")
	public String SearchEmpPage(@RequestParam("txtEmpno") int eno, Model m)
	{
		Employee emp = es.SearchEmployee(eno);
		
		if(emp==null)
			m.addAttribute("msg", "Emp Not Found");
			
			m.addAttribute("emp", emp);
		return "SearchEmp";
	}
	
	@GetMapping("/delemp/{eno}")
	public String DeleteEmp(@PathVariable("eno") int eno, Model m)
	{
		es.DelEmployee(eno);
		return "redirect:/empall";
	}
	
	@GetMapping("/empjob")
	public String GetEmpBasedOnJob(Model m)
	{
		return "EmpBasedOnJob";
	}
	
	@PostMapping("/sempjob")
	public String GetEmpBasedOnJob(@RequestParam("txtJob") String job, Model m)
	{	List<Employee>  empjoblist = null;
		try
		{
			empjoblist = es.ShowAllJobRelatedEmps(job);
			m.addAttribute("empjoblist", empjoblist);
		}
		catch(Exception ex)
		{
			empjoblist = null;
			m.addAttribute("empjoblist", empjoblist);
			m.addAttribute("msg", "No emps exist with given job");			
		}
		
		return "EmpBasedOnJob";
	}
}
