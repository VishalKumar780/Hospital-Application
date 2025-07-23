package com.Vishal.Hospital.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vishal.Hospital.Entities.Appointment;
import com.Vishal.Hospital.Repositories.AppointmentRepository;

@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentRepository appointmentRepository;
	
	public String createAppointment(Appointment appointment) {
       
        boolean exists = appointmentRepository.existsByDoctorIdAndDate(
            appointment.getDoctor().getId(),
            appointment.getDateTime()
        );

        if (exists) {
        	return "Appointment already booked.";
        }
        else {
        	 appointmentRepository.save(appointment);
             return "Appointment created successfully.";
        } 
    }

	
	public String updateAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);
		return "Appointment updated Successfully.";
	}
	
	public List<Appointment> getAllAppointments(){
		return appointmentRepository.findAll();
	}
	
	public Appointment getAppointmentById(Long id) {
		return appointmentRepository.findById(id).orElse(null);
	}
	
	public void deleteByAppointmentId(Long id) {
		appointmentRepository.deleteById(id);
	}


}
