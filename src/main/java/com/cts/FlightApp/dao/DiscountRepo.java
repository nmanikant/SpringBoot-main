package com.cts.FlightApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.FlightApp.entity.Discount;
@Repository
public interface DiscountRepo  extends JpaRepository<Discount, Integer> {

}
