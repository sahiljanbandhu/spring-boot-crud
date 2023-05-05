package com.jsp.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootcrud.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
