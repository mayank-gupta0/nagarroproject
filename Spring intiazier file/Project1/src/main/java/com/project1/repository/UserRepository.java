package com.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.entity.UserRegistration;

@Repository
public interface UserRepository extends JpaRepository<UserRegistration, Integer> {
	
	public UserRegistration findByEmail(String email);


}
