package com.Vishal.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vishal.Hospital.Entities.Patient;
import com.Vishal.Hospital.Services.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}
	
	@PutMapping
	@PreAuthorize("hasRole('ADMIN')")
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}
	
	@GetMapping
	@PreAuthorize("hasAnyRole('ADMIN', 'DOCTOR')")
	public List<Patient> getAllPatients(){
		return patientService.getAllPatients();
	}
	
	@GetMapping("/{id}")
	@PreAuthorize("hasAnyRole('ADMIN', 'DOCTOR')")
	public Patient getPatientById(@PathVariable Long id) {
		return patientService.getPatientById(id);
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deleteByPatientId(@PathVariable Long id) {
		patientService.deleteByPatientId(id);
	}

}
