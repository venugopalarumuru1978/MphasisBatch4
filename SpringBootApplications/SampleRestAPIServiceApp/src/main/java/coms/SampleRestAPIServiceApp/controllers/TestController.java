package coms.SampleRestAPIServiceApp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	/*
	 * GET / POST /PUT / DELETE
	 */
	private List<String> lstStr = new ArrayList<String>();
	
	public TestController()
	{
		lstStr.add("Pavan");
		lstStr.add("Kiran");
		lstStr.add("Lavan");
		lstStr.add("Bhavani");
		lstStr.add("Priya");
	}
	
	@GetMapping("/getinfo")
	public String Method1()
	{
		return "This is RestAPI Topic";
	}
	
	@GetMapping("/getStr")
	public ResponseEntity<List<String>>  getStrings()
	{
		return new ResponseEntity<List<String>>(lstStr, HttpStatus.OK);
	}
	
	@GetMapping("/getStr/{str}")
	public ResponseEntity<String>  SearchStrings(@PathVariable String str)
	{
		if(lstStr.contains(str))
			return new ResponseEntity<String>("String is Found", HttpStatus.OK);
		
		return new ResponseEntity<String>("String is Not Found", HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/getStr")
	public ResponseEntity<String>  AddStrings(@RequestBody String str)
	{
		lstStr.add(str);
		return new ResponseEntity<String>("String is Added", HttpStatus.CREATED);
	}

	@DeleteMapping("/getStr/{str}")
	public ResponseEntity<String>  DeleteStrings(@PathVariable String str)
	{
		if(lstStr.contains(str))
		{
			lstStr.remove(str);
			return new ResponseEntity<String>("String is Deleted", HttpStatus.OK);
		}
		return new ResponseEntity<String>("String is Not Found", HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/getStr/{str}")
	public ResponseEntity<String>  ModStrings(@PathVariable String str, 
			@RequestBody String nstr)
	{		
		if(lstStr.contains(str))
		{
			lstStr.remove(str);
			lstStr.add(nstr);
			return new ResponseEntity<String>("String is Updated", HttpStatus.OK);
		}
		return new ResponseEntity<String>("String is Not Found", HttpStatus.NOT_FOUND);
	}
	
}
