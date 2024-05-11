package coms.DataJpaOneToManyRelationApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import coms.DataJpaOneToManyRelationApp.entities.CusResponse;
import coms.DataJpaOneToManyRelationApp.entities.Customer;
import coms.DataJpaOneToManyRelationApp.service.CustomerService;

@RestController
@RequestMapping("/onetomany")
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	@PostMapping("/customer")
	public ResponseEntity<String>  AddCustomerInfo(@RequestBody Customer cust)
	{
		cs.AddCustomer(cust);
		return new ResponseEntity<String>("New Customer is Added...", HttpStatus.OK);
	}
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> GetAllCustomer()
	{
		List<Customer> custList = cs.ShowAllCustomers();
		return new ResponseEntity<List<Customer>>(custList, HttpStatus.OK);
	}

	@GetMapping("/customer/{id}")
	public ResponseEntity<Object> GetACustomer(@PathVariable("id") int id)
	{
		Customer cust =  cs.SearchCustomer(id);
		if(cust!=null)
			return new ResponseEntity<Object>(cust, HttpStatus.OK);
		
		return new ResponseEntity<Object>("No Customer Found...", HttpStatus.OK);
	}
	
	@GetMapping("/cinfo")
	public ResponseEntity<List<CusResponse>> FetchCustomers()
	{
		List<CusResponse> custList = cs.FetchAllCustomers();
		return new ResponseEntity<List<CusResponse>>(custList, HttpStatus.OK);
	}
	
	@GetMapping("/cinfo/{pid}")
	public ResponseEntity<Object> FetchCustomerBasedOnPid(@PathVariable("pid") int pid)
	{
		CusResponse cust = cs.FetchCustomersBasedOnPid(pid);
		if(cust!=null)
			return new ResponseEntity<Object>(cust, HttpStatus.OK);
		return new ResponseEntity<Object>("Product Not Found", HttpStatus.OK);
	}
}
