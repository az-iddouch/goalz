package io.goalz.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GatewayApplication {

	public static void main(String[] args) {
		System.out.println("gateway running in port 8080 ....");
		SpringApplication.run(GatewayApplication.class, args);
	}


	@GetMapping("/ping")
	String ping() {
		return "pong";
	}


}
