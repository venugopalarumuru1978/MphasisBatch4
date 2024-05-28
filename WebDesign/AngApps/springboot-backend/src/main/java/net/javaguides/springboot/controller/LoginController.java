package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Login;
import net.javaguides.springboot.repository.LoginRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class LoginController {

	@Autowired
	LoginRepo lr;
	
	@GetMapping("/login/{user}/{pwd}")
	public boolean UserCheck(@PathVariable String user, @PathVariable String pwd)
	{
		System.out.println(user + " === " + pwd);
		 
		boolean b=false;
		List<Login> userdetails = lr.findAll();
		for(Login l : userdetails)
		{
			System.out.println(l.getUsername() + "  " + l.getPassword());
			if(l.getUsername().equals(user) && l.getPassword().equals(pwd))
			{
				b = true;
				break;
			}
		}
		return b;
	}
}
