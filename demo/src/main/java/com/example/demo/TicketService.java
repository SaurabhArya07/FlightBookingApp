package com.example.demo;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	@Autowired
	TicketRepository ticketRepository;
//	public void save(Ticket ticket) {
//		ticketRepository.save(ticket);
//		System.out.println(ticket);
//	}
	List<Ticket> getTicket(int pnr) {
		return ticketRepository.findBypnr(pnr);
	}
	
	List<Ticket> getHistory(String email){
		return ticketRepository.findByemail(email);
	}
	
	void bookTicket(int flightId, Ticket ticket) {
		Random r = new Random();
		int pnr = 100000 + (int)(r.nextFloat() * 99099);
		ticket.setFlightId(flightId);
		ticket.setPnr(pnr);
		ticketRepository.save(ticket);
	}
	
	void deleteBooking(int pnr) {
		ticketRepository.deleteById(pnr);
	}

}
