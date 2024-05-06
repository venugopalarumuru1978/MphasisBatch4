package coms.TestServiceProviderApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestServiceProviderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceProviderAppApplication.class, args);
		System.out.println("Provider App Started...");
	}

}
