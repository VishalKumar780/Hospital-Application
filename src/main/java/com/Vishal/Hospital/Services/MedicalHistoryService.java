package com.Vishal.Hospital.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vishal.Hospital.Entities.MedicalHistory;
import com.Vishal.Hospital.Repositories.MedicalHistoryRepository;

@Service
public class MedicalHistoryService {
	
	@Autowired
	private MedicalHistoryRepository medicalHistoryRepository;
	
	public MedicalHistory saveMedicalHistory(MedicalHistory medicalHistory) {
		return medicalHistoryRepository.save( medicalHistory);
	}
	

	public MedicalHistory updateMedicalHistory(MedicalHistory medicalHistory) {
		return medicalHistoryRepository.save( medicalHistory);
	}
	
	public List<MedicalHistory> getAllMedicalHistories(){
		return medicalHistoryRepository.findAll();
	}
	
	public MedicalHistory getMedicalHistoryById(Long id) {
		return medicalHistoryRepository.findById(id).orElse(null);
	}
	
	public void deleteByMedicalHistoryId(Long id) {
		medicalHistoryRepository.deleteById(id);
	}


}
