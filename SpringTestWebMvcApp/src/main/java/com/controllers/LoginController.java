package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String LoginPage(Model m)
	{
		return "Login";
	}
	
	@PostMapping("/loginfo")
	public String LoginPage(
			@RequestParam("txtUname") String uname,
			@RequestParam("txtPwd") String pwd, 
			Model m)
	{
		System.out.println(uname + "\t" + pwd);
		if(uname.equals("Venugopal") && pwd.equals("v@123"))
			return "Welcome";
		else
			m.addAttribute("msg", "Please check username /password");
		
		return "Login";
	}
}
