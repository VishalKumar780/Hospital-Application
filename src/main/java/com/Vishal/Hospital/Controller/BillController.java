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

import com.Vishal.Hospital.Entities.Bill;
import com.Vishal.Hospital.Services.BillService;

@RestController
@RequestMapping("/bills")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public  String createBill(@RequestBody Bill bill) {
		return billService.saveBill(bill);
	}
	
	@PutMapping
	@PreAuthorize("hasRole('ADMIN')")
	public  String updateBill(@RequestBody Bill bill) {
		return billService.saveBill(bill);
	}
	
	@GetMapping
	@PreAuthorize("hasRole('ADMIN')")
	public List<Bill> getAllBills(){
		return billService.getAllBills();
	}
	
	@GetMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public Bill getBillById(@PathVariable Long id) {
		return billService.getBillById(id);
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deleteByBillId(@PathVariable Long id) {
		billService.deleteByBillId(id);
	}

}
