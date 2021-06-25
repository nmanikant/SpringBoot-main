package com.cts.FlightApp.entity;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Flights {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int flightId;
	@Column
	String airlineName;
	@Column
	String arrival;
	@Column
	String depature;
	@Column
	String totJourneyTime;
	@Column
	String endTime;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDepature() {
		return depature;
	}
	public void setDepature(String depature) {
		this.depature = depature;
	}
	public String getDuration() {
		return totJourneyTime;
	}
	public void setDuration(String duration) {
		this.totJourneyTime = duration;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getMeals() {
		return meals;
	}
	public void setMeals(String meals) {
		this.meals = meals;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	@Column
	String flightNumber;
	
	@Column
	String meals;
	@Column
	int price;
	@Column
	String startTime;
	@Column
	Date travelDate;
	
	
	
	
	

}
