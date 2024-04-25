package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.models.Student;

@Controller
public class StudentController {

	
	@GetMapping("stdreg")
	public String StudentInfo(Model m)
	{
		Student std = new Student();
		m.addAttribute("std", std);
		return "StudentReg";
	}
	@PostMapping("stdreginfo")
	public String StudentInfo(@ModelAttribute("std") Student std, Model m)
	{
		System.out.println(std.getRollno());
		System.out.println(std.getSname());
		System.out.println(std.getCourse());
		System.out.println(std.getFees());
		
		m.addAttribute("sinfo", std);
		m.addAttribute("std", new Student());
		
		
		return "StudentReg";
	}
}
