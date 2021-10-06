package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	Ticket findBypnr(int pnr);
	List<Ticket> findByemail(String email);
	
}
