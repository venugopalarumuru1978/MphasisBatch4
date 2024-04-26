package coms.FirstSpringBootApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String HomePage()
	{
		return "Page1";
	}

	@GetMapping("/pg1")
	public String Page1()
	{
		return "Page1";
	}
	
	@GetMapping("/pg2")
	public String Page2()
	{
		return "Page2";
	}
	
}
