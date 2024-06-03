package coms.RestAPIDataJpaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.RestAPIDataJpaApp.entities.Customer;
import coms.RestAPIDataJpaApp.repos.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo cr;
	
	@Override
	public void AddCustomer(Customer cust) {
		cr.save(cust);
	}

	@Override
	public List<Customer> ShowAll() {		
		return cr.findAll();
	}

	@Override
	public Customer SearchCustomer(int cid) {
			Optional<Customer>  cinfo = cr.findById(cid);
			if(cinfo.isPresent())
				return cinfo.get();
		
			return null;
	}

	@Override
	public int DeleteCustomer(int cid) {
			cr.deleteById(cid);
		return 1;
	}
	
}
