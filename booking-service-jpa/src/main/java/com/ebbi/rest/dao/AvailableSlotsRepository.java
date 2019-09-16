package com.ebbi.rest.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ebbi.rest.model.AvailableSlots;

public interface AvailableSlotsRepository extends CrudRepository<AvailableSlots, Integer> {
	
	
	@Query("FROM AvailableSlots WHERE calendarDate = ?1")
    AvailableSlots findByCalendarDate(String date);
 
	
	
}
