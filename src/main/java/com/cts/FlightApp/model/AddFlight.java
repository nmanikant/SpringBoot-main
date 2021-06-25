package com.cts.FlightApp.model;



public class AddFlight {
	

	public AddFlight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepatureLoc() {
		return depatureLoc;
	}

	public void setDepatureLoc(String depatureLoc) {
		this.depatureLoc = depatureLoc;
	}

	public String getArrivalLoc() {
		return arrivalLoc;
	}

	public void setArrivalLoc(String arrivalLoc) {
		this.arrivalLoc = arrivalLoc;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMealPreferene() {
		return mealPreferene;
	}

	public void setMealPreferene(String mealPreferene) {
		this.mealPreferene = mealPreferene;
	}

	public String getBusinessClass() {
		return businessClass;
	}

	public void setBusinessClass(String businessClass) {
		this.businessClass = businessClass;
	}

	public String getEconomicClass() {
		return economicClass;
	}

	public void setEconomicClass(String economicClass) {
		this.economicClass = economicClass;
	}

	public int getTravellers() {
		return travellers;
	}

	public void setTravellers(int travellers) {
		this.travellers = travellers;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getScheduleDays() {
		return scheduleDays;
	}

	public void setScheduleDays(String scheduleDays) {
		this.scheduleDays = scheduleDays;
	}

	String flightNumber;
	
	String depatureLoc;

	String arrivalLoc;
	
	String date;

	String startTime;

	String endTime;

	int price;

	String mealPreferene;
	
	String businessClass;
	
	String economicClass;
	
	int travellers;
	
	int duration;
	
	String scheduleDays;

}
