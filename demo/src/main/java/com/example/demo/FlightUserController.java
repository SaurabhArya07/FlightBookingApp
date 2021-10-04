package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1.0/flight")
@RestController
public class FlightUserController {
	@Autowired 
	FlightService flightService;
	@Autowired
	TicketService ticketService;
	
	@PostMapping("/airline/register")
	String register(@RequestBody String airline) {
		System.out.println(airline);
		return "Airline booked successfully";
	}
	
	@PostMapping("/booking/{flightid}")
	String bookTicket(@PathVariable int flightid, @RequestBody Ticket ticket) {
		System.out.println(flightid);
		System.out.println(ticket);
		ticketService.bookTicket(flightid, ticket);
		return "Flight booked successfully";
	}
	
	@GetMapping("/ticket/{pnr}")
	List<Ticket> getPnrNumber(@PathVariable int pnr) {
		return ticketService.getTicket(pnr);
	}
	
	@GetMapping("/booking/history/{emailid}")
	List<Ticket> getHistory(@PathVariable String emailid){
		return ticketService.getHistory(emailid);
	}
	
	@PostMapping("/search")
	List<Inventory> FlightSearch(@RequestBody Inventory inventory){
		return flightService.searchFlight(inventory);
	}	
	
	@DeleteMapping("/booking/cancel/{pnr}")
	void deleteBooking(@PathVariable int pnr) {
		ticketService.deleteBooking(pnr);
		System.out.println("Booking with the PNR : " + pnr + " is successfully cancelled!!");
	}

}
