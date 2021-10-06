package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
	@Autowired
	FlightRepository repository;
	TicketRepository ticketRepo;
	
	public void save(Inventory inventory) {
		repository.save(inventory);
		System.out.println(inventory);
	}
	
	List<Inventory> searchFlight(Inventory inventory) {
		return repository.findByflightNumber( inventory.getFlightNumber());
	}	
	
	
	
	
}
