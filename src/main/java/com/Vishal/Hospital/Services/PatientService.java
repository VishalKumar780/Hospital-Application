package com.Vishal.Hospital.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vishal.Hospital.Entities.Patient;
import com.Vishal.Hospital.Repositories.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository ;
	
	public Patient savePatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public Patient updatePatient(Patient patient) {
		return patientRepository.save(patient);
	}
	
	
	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
	}
	
	public Patient getPatientById(Long id) {
		return patientRepository.findById(id).orElse(null);
	}
	
	public void deleteByPatientId(Long id) {
		patientRepository.deleteById(id);
	}


}
