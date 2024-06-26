package coms.TestServiceConsumerApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/c_app")
public class TestConsumerController {

	@Autowired
	DiscoveryClient clientinfo;
	
	@GetMapping("/getinfo")
	public String getData()
	{
		RestTemplate rt = new RestTemplate();
		
		List<ServiceInstance> list = clientinfo.getInstances("TEST-PROVIDER");
		
		System.out.println(list);
		System.out.println(list.get(0).getUri());
		
		ResponseEntity<String>  resp = rt.getForEntity(list.get(0).getUri() + "/p_app/p_test", String.class);
		return "Provider from Consumer : " + resp.getBody();
	}
}

// list.get(0).getUri() = http://localhost:9801/