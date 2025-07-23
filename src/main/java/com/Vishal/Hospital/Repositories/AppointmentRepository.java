package com.Vishal.Hospital.Repositories;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Vishal.Hospital.Entities.Appointment;

public interface AppointmentRepository  extends JpaRepository<Appointment,Long>{

	boolean existsByDoctorIdAndDate(Long id, LocalDateTime localDateTime);	
}
