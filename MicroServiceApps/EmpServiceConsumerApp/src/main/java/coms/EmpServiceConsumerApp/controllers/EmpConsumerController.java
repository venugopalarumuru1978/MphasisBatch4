package coms.EmpServiceConsumerApp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import coms.EmpServiceConsumerApp.entities.Employee;

@RestController
@RequestMapping("emp_consumer")
public class EmpConsumerController {

	@Autowired
	DiscoveryClient client;
	
	@GetMapping("/getemp")
	public List<Employee> GetAll()
	{
		List<Employee>  emplst = new ArrayList<Employee>();
		RestTemplate rt = new RestTemplate();
		List<ServiceInstance> list = client.getInstances("EMP-PROVIDER");
		System.out.println(list);

		ResponseEntity<Employee> resp =  rt.getForEntity(list.get(0).getUri() + "/emp_provider/employee", Employee.class);
		emplst =(List<Employee>) resp.getBody();
		return emplst;
		
	}
}
