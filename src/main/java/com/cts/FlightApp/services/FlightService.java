package com.cts.FlightApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.FlightApp.dao.FlightRepo;
import com.cts.FlightApp.entity.Flights;



@Service
public class FlightService {

	@Autowired
    private FlightRepo repo;
	
	public List<Flights> getAllFlights() {
        return repo.findAll();
    }
	
	public Flights addFlight(Flights flight) {
       return repo.save(flight);
    }
     
    public Flights getFlightById(int id) {
        return repo.findById(id).get();
    }
     
    public void deleteFlightById(int id) {
        repo.deleteById(id);   
    }
    
    public Flights updateFlight(Flights flights) {
       return repo.save(flights);   
    }
    
    
    public List<Flights> getFlightsByData(String depature,String arrival) {
        return repo.getFlightsByData(depature, arrival);
    }
	
}
