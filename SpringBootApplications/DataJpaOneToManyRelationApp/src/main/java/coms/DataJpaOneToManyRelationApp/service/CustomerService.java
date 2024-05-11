package coms.DataJpaOneToManyRelationApp.service;

import java.util.List;

import coms.DataJpaOneToManyRelationApp.entities.CusResponse;
import coms.DataJpaOneToManyRelationApp.entities.Customer;

public interface CustomerService {
	public void AddCustomer(Customer cust);
	public List<Customer>  ShowAllCustomers();
	public Customer SearchCustomer(int cid);
	public List<CusResponse>  FetchAllCustomers();
	public CusResponse  FetchCustomersBasedOnPid(int pid);
	
}


