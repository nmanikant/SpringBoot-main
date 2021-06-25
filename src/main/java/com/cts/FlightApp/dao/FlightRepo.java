package com.cts.FlightApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cts.FlightApp.entity.Flights;


@Repository
public interface FlightRepo  extends JpaRepository<Flights, Integer>  {

	
	@Query("SELECT f FROM Flights f  WHERE f.depature=?1 and f.arrival=?2")
	List<com.cts.FlightApp.entity.Flights> getFlightsByData(String depature,String arrival);
	
	
	
}
