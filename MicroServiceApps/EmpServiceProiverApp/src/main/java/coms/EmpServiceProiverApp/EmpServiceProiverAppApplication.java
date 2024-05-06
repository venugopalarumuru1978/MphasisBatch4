package coms.EmpServiceProiverApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmpServiceProiverAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpServiceProiverAppApplication.class, args);
		System.out.println("Emp Service Provider App");
	}
}
