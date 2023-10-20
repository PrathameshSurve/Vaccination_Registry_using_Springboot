package com.vaccination_details.vaccination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VaccinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationApplication.class, args);
		System.out.println("Server Started.-----#################### Go for Vacination Registration.");
	}

	@RequestMapping
	public String hello() {
		return "Welcome to Vaccination Details";
	}

}
