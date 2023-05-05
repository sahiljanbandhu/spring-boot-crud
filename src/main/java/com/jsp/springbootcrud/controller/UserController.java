package com.jsp.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootcrud.dto.User;
import com.jsp.springbootcrud.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}
	
	@GetMapping("/users")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@DeleteMapping("/users/{id}")
	public boolean deleteUserById(@PathVariable int id) {
		return userService.deleteUserById(id);
	}

	@PutMapping("/users/{id}")
	public User updateUserById(@PathVariable int id, @RequestBody User user) {
		return userService.updateUser(id, user);

	}
}
