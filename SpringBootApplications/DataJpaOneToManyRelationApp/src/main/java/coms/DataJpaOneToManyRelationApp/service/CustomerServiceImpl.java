package coms.DataJpaOneToManyRelationApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.DataJpaOneToManyRelationApp.entities.CusResponse;
import coms.DataJpaOneToManyRelationApp.entities.Customer;
import coms.DataJpaOneToManyRelationApp.repo.CustomerRepo;
import coms.DataJpaOneToManyRelationApp.repo.ProductsRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo cr;
	
	@Autowired
	ProductsRepo pr;
	
	@Override
	public void AddCustomer(Customer cust) {
		cr.save(cust);
	}

	@Override
	public List<Customer> ShowAllCustomers() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Customer SearchCustomer(int cid) {
		// TODO Auto-generated method stub
		Optional<Customer>  cus = cr.findById(cid);
		if(cus.isEmpty())
			return null;
		return cus.get();
	}

	@Override
	public List<CusResponse> FetchAllCustomers() {
		// TODO Auto-generated method stub
		return cr.getCustomerProductInfo();
	}

	@Override
	public CusResponse FetchCustomersBasedOnPid(int pid) {
		CusResponse  cinfo = cr.getCustomerProductInfoBasedOnPrdId(pid);
		if(cinfo!=null)
			return cinfo;
		return null;
	}
}
