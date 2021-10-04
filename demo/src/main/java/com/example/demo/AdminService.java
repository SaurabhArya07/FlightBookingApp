package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
	AdminRepository repository;
	
	void adminLogin(String email, String password) {
		AdminDetails admin = new AdminDetails();
		
	}

}
