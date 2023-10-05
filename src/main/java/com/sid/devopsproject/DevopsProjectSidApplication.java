package com.sid.devopsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsProjectSidApplication {
	@GetMapping
	public String message() { return "welcome from sidaoui"; }
	public static void main(String[] args) {
		SpringApplication.run(DevopsProjectSidApplication.class, args);
	}

}
