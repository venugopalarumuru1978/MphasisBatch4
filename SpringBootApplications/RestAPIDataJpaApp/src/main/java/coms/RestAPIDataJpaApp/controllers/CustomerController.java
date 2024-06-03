package coms.RestAPIDataJpaApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coms.RestAPIDataJpaApp.entities.Customer;
import coms.RestAPIDataJpaApp.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Medicare/v1/")   //url: http://localhost:9091/Medicare/v1/customer
public class CustomerController {

	@Autowired
	CustomerService  cs;
	
	@PostMapping("/customer")
	public ResponseEntity<Object> AddNewCustomer(@RequestBody Customer cust)
	{
		cs.AddCustomer(cust);
		return new ResponseEntity<Object>("Customer Added...", HttpStatus.OK);
	}
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> ViewAllCustomer()
	{
		return new ResponseEntity<List<Customer>>(cs.ShowAll(), HttpStatus.OK);
	}

	@GetMapping("/customer/{cid}")
	public ResponseEntity<Customer> GetCustomer(@PathVariable int cid)
	{
		Customer cust = cs.SearchCustomer(cid);
		if(cust!=null)
			return new ResponseEntity<Customer>(cust, HttpStatus.OK);
			
		return new ResponseEntity("No Customer Found", HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<Integer> DelCustomer(@PathVariable int cid)
	{
		return new ResponseEntity<Integer>(cs.DeleteCustomer(cid), HttpStatus.OK);
	}

}
