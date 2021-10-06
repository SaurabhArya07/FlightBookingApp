package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class FlightController {
	@Autowired
	FlightService flightService;
	AdminService adminService;
		
	@PostMapping("/admin/login")
	String adminLogin(@RequestBody AdminDetails admin) {
		System.out.println(admin);
		return "Logged in Successfully";
	}
	
	
	@PostMapping("/airline/inventory/add")
	String addEntry(@RequestBody Inventory inventory) throws Exception {
		flightService.save(inventory);
		return "Flight details added successfully!!";
	}


	private Exception RuntimeException(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
