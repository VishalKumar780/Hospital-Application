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

import com.Vishal.Hospital.Entities.Appointment;
import com.Vishal.Hospital.Services.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping
	@PreAuthorize("hasAnyRole('ADMIN', 'PATIENT')")
	public String createAppointment(@RequestBody Appointment appointment) {
		return appointmentService.createAppointment(appointment);
    }
	
	@PutMapping("/{id}")
	@PreAuthorize("hasAnyRole('ADMIN', 'PATIENT')")
	public  String updateAppointment(@RequestBody Appointment appointment) {
		return appointmentService.updateAppointment(appointment);
	}
	
	@GetMapping
	@PreAuthorize("hasAnyRole('ADMIN', 'DOCTOR')")
	public List<Appointment> getAllAppointment(){
		return appointmentService.getAllAppointments();
	}
	
	@GetMapping("/{id}")
	@PreAuthorize("hasAnyRole('ADMIN', 'DOCTOR', 'PATIENT')")
	public Appointment getAppointmentById(@PathVariable Long id) {
		return appointmentService.getAppointmentById(id);
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasAnyRole('ADMIN', 'PATIENT')")
	public void deleteByAppointmentId(@PathVariable Long id) {
		appointmentService.deleteByAppointmentId(id);
	}

}
