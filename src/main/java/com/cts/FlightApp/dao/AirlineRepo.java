package com.cts.FlightApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AirlineRepo extends JpaRepository<com.cts.FlightApp.entity.Airline, Integer>  {
	

}
