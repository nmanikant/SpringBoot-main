package com.cts.FlightApp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airline {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int airlineId;
	@Column
	String airlineName;
	@Column
	String logo;
	@Column()
	String contactAddress;
	@Column()
	int contactNumber;
	
	@Column
	String flightNumber;
	
	//List<Flights> flights;
	
	/*flight details*/
	public Airline() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	/*
	 * public List<Flights> getFlights() { return flights; }
	 * 
	 * public void setFlights(List<Flights> flights) { this.flights = flights; }
	 */
	
	
	
	
	
	

}
