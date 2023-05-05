package com.jsp.springbootcrud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootcrud.dto.User;
import com.jsp.springbootcrud.repository.UserRepository;

@Repository
public class UserDao {
	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User getUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		if (user != null) {
			return user.get();
		} else {
			return null;
		}
	}
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	public boolean deleteUserById(int id) {
		Optional<User>user=	userRepository.findById(id);
		if (user != null) {
			userRepository.delete(user.get());
			return true;
		} else {
			return false;
		}
	}
	
	public User updateUser(int id, User user) {
		Optional<User>opt=	userRepository.findById(id);
		if (opt.isPresent()) {
			return userRepository.save(user);
		}
		else {
			return null;
		}
	}
}
