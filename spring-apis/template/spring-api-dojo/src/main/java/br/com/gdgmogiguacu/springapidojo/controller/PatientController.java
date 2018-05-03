package br.com.gdgmogiguacu.springapidojo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

	@GetMapping
	private String get() {
		return "Hello API!";
	}
}
