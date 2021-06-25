package com.cts.FlightApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.FlightApp.entity.Airline;
import com.cts.FlightApp.entity.Flights;
import com.cts.FlightApp.entity.TicketBookingDetails;
import com.cts.FlightApp.services.AirlineService;
import com.cts.FlightApp.services.BookingService;
import com.cts.FlightApp.services.FlightService;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
 
	@Autowired 
	AirlineService airlineService;
	
	@Autowired 
	FlightService flightService;
	@Autowired 
	BookingService bookingService;

	
	  @GetMapping("/airlines")
	  public ResponseEntity<List<Airline>> getAllAirlines() {
	  List<Airline> list = airlineService.getAllAirlines();
	 
	  return new ResponseEntity<List<Airline>>(list,HttpStatus.OK); }
	 
	 @GetMapping("/airline/{id}")
	    public ResponseEntity<Airline> getAirline(@PathVariable("id") int id) {
	       Airline list = airlineService.getAirlineById(id);
	 
	        return new ResponseEntity<Airline>(list,HttpStatus.OK);
	    }
	 
	 @PostMapping("/managearline")
	    public ResponseEntity<Airline> addAirline(@RequestBody Airline airline)
	                                                    {
		 Airline added =  airlineService.saveAirline(airline);
	        return new ResponseEntity<Airline>(added, new HttpHeaders(), HttpStatus.OK);
	    }
	 
	 @DeleteMapping("/deleteairline/{id}")
	    public HttpStatus deleteAirlineById(@PathVariable("id") int id) 
	                                                   {
		 airlineService.deleteAirlineById(id);
	        return HttpStatus.FORBIDDEN;
	    }
	
	 
	 /* flight service*/
	 
	 
	 
	 @GetMapping("/manageSchedule")
	    public ResponseEntity<List<Flights>> getAllFlights() {
	        List<Flights> list = flightService.getAllFlights();
	 
	        return new ResponseEntity<List<Flights>>(list,HttpStatus.OK);
	    }
	 @GetMapping("/fligt/{id}")
	    public ResponseEntity<Flights> getFlight(@PathVariable("id") int id) {
		 Flights list = flightService.getFlightById(id);
	 
	        return new ResponseEntity<Flights>(list,HttpStatus.OK);
	    }
	 
	 @GetMapping("/result/{depature}/{arrival}")
	    public ResponseEntity<List<Flights>> getFlightByLocation(@PathVariable("depature") String depature,@PathVariable("arrival") String arrival) {
		 List<Flights> list = flightService.getFlightsByData(depature,arrival);
	 
	        return new ResponseEntity<List<Flights>>(list,HttpStatus.OK);
	    }
	 
	 @DeleteMapping("/manageSchedule/{id}")
	    public HttpStatus deleteFlightById(@PathVariable("id") int id) 
	                                                   {
		 flightService.deleteFlightById(id);
	        return HttpStatus.FORBIDDEN;
	    }
	 @PostMapping("/addflight")
	    public ResponseEntity<Flights> addFlight(@RequestBody Flights flight)
	                                                    {
		 Flights added =  flightService.addFlight(flight);
	        return new ResponseEntity<Flights>(added, new HttpHeaders(), HttpStatus.OK);
	    }
	 @PutMapping("/update/{flightId}")
	 public ResponseEntity<Flights> updateFlight(@PathVariable("flightId") int flightId,@RequestBody Flights flight)
	 {
		 Flights flightRes = flightService.updateFlight(flight);
		 ResponseEntity<Flights> response =
					new ResponseEntity<Flights>(flightRes, HttpStatus.OK);
			return response;
			 
		 }

	 
	 /*booking service*/
	 
	 
	 @PostMapping("/book-flight")
	    public ResponseEntity<TicketBookingDetails> bookTicket(@RequestBody TicketBookingDetails ticketDetails)
	    {
		 TicketBookingDetails added =  bookingService.bookTicket(ticketDetails);
	        return new ResponseEntity<TicketBookingDetails>(added, new HttpHeaders(), HttpStatus.OK);
	    }
	 
	 @GetMapping("/booking-history/{email}")
	    public ResponseEntity< List<TicketBookingDetails>> getDetailsByEmail(@PathVariable("email") String email) {
		 List<TicketBookingDetails> added =  bookingService.getDetailsByEmail(email);
	        return new ResponseEntity< List<TicketBookingDetails>>(added, new HttpHeaders(), HttpStatus.OK);
	    }
		/*
		 * @DeleteMapping("/booking-history/{email}") public HttpStatus
		 * deleteTicket(@PathVariable("email") String email) {
		 * bookingService.deleteTicket(email); return HttpStatus.FORBIDDEN; }
		 */
	 
}

