package com.Vishal.Hospital.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vishal.Hospital.Entities.User;

public interface UserRepository  extends JpaRepository<User,Long>{

	User findByUsername(String username);

}
