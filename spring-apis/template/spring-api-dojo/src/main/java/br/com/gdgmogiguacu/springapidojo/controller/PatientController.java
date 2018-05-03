package br.com.gdgmogiguacu.springapidojo.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gdgmogiguacu.springapidojo.entity.Patient;
import br.com.gdgmogiguacu.springapidojo.service.PatientService;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;

	// TODO: work on ResponseStatus =)
	@GetMapping(value = "/{id}")
	private Optional<Patient> getOne(@PathVariable("id") final UUID id) {
		return patientService.findOne(id);
	}

	@GetMapping(value = "/")
	private List<Patient> get() {
		return patientService.findAll();
	}

	@PostMapping
	private UUID create(@RequestBody final Patient patient) {
		return patientService.create(patient);
	}

	@PutMapping(path = "/{id}")
	private void update(@PathVariable("id") UUID id, @RequestBody final Patient patient) {
		patient.setId(id);
		patientService.update(patient);
	}

	@DeleteMapping(path = "/{id}")
	private void delete(@PathVariable("id") UUID id) {
		patientService.delete(id);
	}
}
