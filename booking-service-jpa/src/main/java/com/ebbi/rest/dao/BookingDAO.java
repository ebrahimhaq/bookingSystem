package com.ebbi.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ebbi.rest.model.Booking;

@Repository
public class BookingDAO {
	
	@Autowired
	private BookingRepository rep;
	
    
	public Booking bookSlot(Booking slot) {
		
		return rep.save(slot);
	}

}
