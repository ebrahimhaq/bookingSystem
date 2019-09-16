package com.ebbi.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.ebbi.rest.model.Booking;

public class BookingDAO {
	
	@Autowired
	private BookingRepository rep;
	
    
	public Booking bookSlot(Booking slot) {
		
		return rep.save(slot);
	}

}
