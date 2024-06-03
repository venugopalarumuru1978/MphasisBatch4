package coms.RestAPIDataJpaApp.service;

import java.util.List;

import coms.RestAPIDataJpaApp.entities.Customer;

public interface CustomerService {

	public void AddCustomer(Customer cust);
	public List<Customer> ShowAll();
	public Customer SearchCustomer(int cid);
	public int DeleteCustomer(int cid);
}
