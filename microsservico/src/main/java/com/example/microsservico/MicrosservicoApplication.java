package com.example.microsservico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MicrosservicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrosservicoApplication.class, args);
	}

	@GetMapping("/ola")
	public String ola() {
		return "Olá do Meu Microsserviço!";
	}
}
