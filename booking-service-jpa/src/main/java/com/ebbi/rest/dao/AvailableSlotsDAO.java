package com.ebbi.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ebbi.rest.model.AvailableSlots;

@Repository
public class AvailableSlotsDAO {
	
	@Autowired
	private AvailableSlotsRepository rep;
	
	public AvailableSlots getAvailableSlots(String searchDate) {
		
		AvailableSlots slots = rep.findByCalendarDate(searchDate);
						
		return slots;
	}
	
     public AvailableSlots createOrUpdateSlot(AvailableSlots slot) {
		
		return rep.save(slot);
	}
     
    
}
