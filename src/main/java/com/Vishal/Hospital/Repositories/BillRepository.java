package com.Vishal.Hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vishal.Hospital.Entities.Bill;

public interface BillRepository extends JpaRepository<Bill,Long>{

}
