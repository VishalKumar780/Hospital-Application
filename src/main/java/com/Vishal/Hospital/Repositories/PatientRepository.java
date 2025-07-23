package com.Vishal.Hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vishal.Hospital.Entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
