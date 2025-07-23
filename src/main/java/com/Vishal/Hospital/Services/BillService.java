package com.Vishal.Hospital.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vishal.Hospital.Entities.Bill;
import com.Vishal.Hospital.Repositories.BillRepository;

@Service
public class BillService {
	
	@Autowired
	private BillRepository billRepository;
	
	public String saveBill(Bill bill) {
		billRepository.save(bill);
		return "Bill created Successfully.";
	}
	
	public String updateBill(Bill bill) {
		billRepository.save(bill);
		return "Bill updated successfully.";
	}
	
	public List<Bill> getAllBills(){
		return billRepository.findAll();
	}
	
	public Bill getBillById(Long id) {
		return billRepository.findById(id).orElse(null);
	}
	
	public void deleteByBillId(Long id) {
		billRepository.deleteById(id);
	}


}
