package br.com.gdgmogiguacu.springapidojo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gdgmogiguacu.springapidojo.entity.Patient;
import br.com.gdgmogiguacu.springapidojo.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repository;

	public Optional<Patient> findOne(final UUID id) {
		return repository.findById(id);
	}

	public List<Patient> findAll() {
		return repository.findAll();
	}

	public UUID create(final Patient patient) {
		return repository.save(patient).getId();
	}

	public void update(final Patient patient) {
		repository.save(patient);
	}

	public void delete(final UUID id) {
		repository.deleteById(id);
	}
}
