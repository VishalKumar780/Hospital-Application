package com.Vishal.Hospital.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.Vishal.Hospital.Entities.User;
import com.Vishal.Hospital.Repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User saveUser(User user) {
	    user.setPassword(passwordEncoder.encode(user.getPassword()));
	    return userRepository.save(user);
	}
	
	public User updateUser(User user) {
	    user.setPassword(passwordEncoder.encode(user.getPassword()));
	    return userRepository.save(user);
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	public  User findByUserName(String username) {
		return userRepository.findByUsername(username);
	}
	
	public void deleteByUserId(Long id) {
		userRepository.deleteById(id);
	}

}
