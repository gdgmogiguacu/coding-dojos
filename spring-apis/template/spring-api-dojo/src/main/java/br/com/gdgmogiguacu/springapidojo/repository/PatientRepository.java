package br.com.gdgmogiguacu.springapidojo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import br.com.gdgmogiguacu.springapidojo.entity.Patient;

public interface PatientRepository extends CrudRepository<Patient, UUID> {

	List<Patient> findAll();
}
