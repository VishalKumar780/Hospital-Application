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


import com.Vishal.Hospital.Entities.User;
import com.Vishal.Hospital.Services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	@PreAuthorize("hasRole('ADMIN')")
	public User createUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PutMapping
	@PreAuthorize("hasRole('ADMIN')")
	public User updateUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping
	@PreAuthorize("hasRole('ADMIN')")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/{username}")
	@PreAuthorize("hasRole('ADMIN')")
	public User getUserByUsername(@PathVariable String username) {
		return userService.findByUserName(username);
	}
	
	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deleteByUserId(@PathVariable Long id) {
		userService.deleteByUserId(id);
	}
}
