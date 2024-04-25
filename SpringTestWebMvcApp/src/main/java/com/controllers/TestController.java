package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/pg1")
	public String WebPage1(Model m)
	{
		String str = "This is Model Class Demo";
		m.addAttribute("info", str);
		return "Page1";  // here page1 is a web page name(Page1.jsp)
	}
	
	@GetMapping("/pg2")
	public String WebPage2(Model m)
	{
		List<String>  lstStr = new ArrayList<String>();
		lstStr.add("Pavan");
		lstStr.add("Kiran");
		lstStr.add("Murali");
		m.addAttribute("lst", lstStr);
		return "Page2";
	}
}
