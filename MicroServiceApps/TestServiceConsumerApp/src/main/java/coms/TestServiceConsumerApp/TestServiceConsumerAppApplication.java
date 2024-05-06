package coms.TestServiceConsumerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestServiceConsumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServiceConsumerAppApplication.class, args);
		System.out.println("Consumer App Started...");
	}
}
