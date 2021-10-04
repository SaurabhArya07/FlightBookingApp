package com.example.demo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Inventory, Integer> {
	List<Inventory> findByflightNumber(double flightNumber);
}
