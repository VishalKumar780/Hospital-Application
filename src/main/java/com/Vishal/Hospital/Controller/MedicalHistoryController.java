package com.Vishal.Hospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vishal.Hospital.Entities.MedicalHistory;
import com.Vishal.Hospital.Services.MedicalHistoryService;

@RestController
@RequestMapping("/medicalHistories")
public class MedicalHistoryController {
	
	@Autowired
	private MedicalHistoryService medicalHistoryService;
	
	@PostMapping
	public MedicalHistory createMedicalHistory(@RequestBody MedicalHistory medicalHistory) {
		return medicalHistoryService.saveMedicalHistory(medicalHistory);
	}
	
	@PutMapping
	public MedicalHistory updateMedicalHistory(@RequestBody MedicalHistory medicalHistory) {
		return medicalHistoryService.saveMedicalHistory(medicalHistory);
	}
	
	@GetMapping
	public List<MedicalHistory> getAllMedicalHistories(){
		return medicalHistoryService.getAllMedicalHistories();
	}
	
	@GetMapping("/{id}")
	public MedicalHistory getMedicalHistoryById(@PathVariable Long id) {
		return medicalHistoryService.getMedicalHistoryById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteByMedicalHistoryId(@PathVariable Long id) {
		medicalHistoryService.deleteByMedicalHistoryId(id);
	}

}
