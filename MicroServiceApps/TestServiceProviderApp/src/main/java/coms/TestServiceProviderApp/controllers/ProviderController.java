package coms.TestServiceProviderApp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p_app")
public class ProviderController {

	@GetMapping("/p_test")
	public String Testmethod()
	{
		return "This is Provider App Result";
	}
}
