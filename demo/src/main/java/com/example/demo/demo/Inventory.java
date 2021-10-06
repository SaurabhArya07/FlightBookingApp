package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer flightId;
	
	private double flightNumber;
	private String airline;
	private String fromPlace;
	private String toPlace;
//	private Date startDate;
//	private Date endDate;
	private String instrumentUsed;
	
	@Min(value=1, message="must be greater than 0")
	private int numberOfBusinessClass;
	
	private int numberOfNonBusinessClass;
	private double ticketCost;
	private int numberOfRows;
	private Meal meal;
	
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	
	public double getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(double flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	
	public String getInstrumentUsed() {
		return instrumentUsed;
	}
	public void setInstrumentUsed(String instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	public int getNumberOfBusinessClass() {
		return numberOfBusinessClass;
	}
	public void setNumberOfBusinessClass(int numberOfBusinessClass) {
		this.numberOfBusinessClass = numberOfBusinessClass;
	}
	public int getNumberOfNonBusinessClass() {
		return numberOfNonBusinessClass;
	}
	public void setNumberOfNonBusinessClass(int numberOfNonBusinessClass) {
		this.numberOfNonBusinessClass = numberOfNonBusinessClass;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public int getNumberOfRows() {
		return numberOfRows;
	}
	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	public Meal getMeal() {
		return meal;
	}
	public void setMeal(Meal meal) {
		this.meal = meal;
	}
//	public Date getStartDate() {
//		return startDate;
//	}
//	public void setStartDate(Date startDate) {
//		this.startDate = startDate;
//	}
//	public Date getEndDate() {
//		return endDate;
//	}
//	public void setEndDate(Date endDate) {
//		this.endDate = endDate;
//	}
	
	
	
	
	
}
