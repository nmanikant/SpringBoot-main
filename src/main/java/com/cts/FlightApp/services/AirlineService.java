package com.cts.FlightApp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.FlightApp.dao.AirlineRepo;
import com.cts.FlightApp.entity.Airline;


@Service
@Transactional
public class AirlineService {

	@Autowired
    private AirlineRepo repo;
	
	public List<Airline> getAllAirlines() {
        return repo.findAll();
    }
     
    public Airline saveAirline(Airline airline) {
       return repo.save(airline);
    }
     
    public Airline getAirlineById(int id) {
        return repo.findById(id).get();
    }
     
    public void deleteAirlineById(int id) {
        repo.deleteById(id);   
    }
    
    public void updateAirline(Airline airline) {
    	
    	
        repo.save(airline);   
    }
}
