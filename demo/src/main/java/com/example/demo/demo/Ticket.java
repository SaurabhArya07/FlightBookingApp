package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer flightId;
	private int pnr;
	
	private String name;
	private String email;
	private String gender;
	private int age;
	
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
//	public int getSeatsBooked() {
//		return seatsBooked;
//	}
//	public void setSeatsBooked(int seatsBooked) {
//		this.seatsBooked = seatsBooked;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public Meal getMeal() {
//		return meal;
//	}
//	public void setMeal(Meal meal) {
//		this.meal = meal;
//	}
//	public int getSeatNumber() {
//		return seatNumber;
//	}
//	public void setSeatNumber(int seatNumber) {
//		this.seatNumber = seatNumber;
//	}
	
	
	

}
