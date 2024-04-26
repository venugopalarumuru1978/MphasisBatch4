package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/tpage")
	public String DemoPage()
	{
		return "TestPage";
	}
}
