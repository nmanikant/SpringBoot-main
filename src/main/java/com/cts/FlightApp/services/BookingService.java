package com.cts.FlightApp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.FlightApp.dao.FlightRepo;
import com.cts.FlightApp.dao.TicketBookingDetailsRepo;
import com.cts.FlightApp.entity.Flights;
import com.cts.FlightApp.entity.TicketBookingDetails;

@Service
@Transactional
public class BookingService {
	@Autowired
    private TicketBookingDetailsRepo repo;
	
	
	 public TicketBookingDetails bookTicket(TicketBookingDetails ticketDetails) {
	       return repo.save(ticketDetails);
	    }
	 
	 public List<TicketBookingDetails> getDetailsByEmail(String email) {
		 
	       return repo.getByEmail(email);
	    }
	 
		/*
		 * public void deleteTicket(String email) {
		 * 
		 * repo.deleteByEmail(email);; }
		 */

}
