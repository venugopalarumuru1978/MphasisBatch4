package coms.ThymeLeafApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/pg1")
	public String Page(Model m)
	{
		return "TestPage1";
	}
}
