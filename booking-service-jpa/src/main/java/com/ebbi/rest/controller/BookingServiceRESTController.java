package com.ebbi.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ebbi.rest.dao.AvailableSlotsDAO;
import com.ebbi.rest.dao.BookingDAO;
import com.ebbi.rest.model.AvailableSlots;
import com.ebbi.rest.model.Booking;

@RestController
@RequestMapping(path = "/bookingservice")
public class BookingServiceRESTController {

	
	    @Autowired
	    private AvailableSlotsDAO availableSlotsDao;
	    
	    @Autowired
	    private BookingDAO bookingDao;
	     
	    @GetMapping(path="/availableslots",  produces = "application/json")
	    public List<AvailableSlots> getAvailableSlots(@RequestParam("date") String date)
	    {
	    	List<AvailableSlots> slots = new ArrayList<AvailableSlots>();
	    	slots.add(availableSlotsDao.getAvailableSlots(date));
	    	
	        return slots;
	    }
	    
	    @PostMapping(path="/createSlot",consumes = "application/json",  produces = "application/json")
	    public AvailableSlots createSlot(@RequestBody AvailableSlots slot)
	    {
	        return availableSlotsDao.createOrUpdateSlot(slot);
	    }
	    
	    @PostMapping(path="/bookSlot",consumes = "application/json",  produces = "application/json")
	    public Booking bookSlot(@RequestBody Booking slot)
	    {
	    	
	    	Booking book = bookingDao.bookSlot(slot);
	    		    	
	    	AvailableSlots avSlots = availableSlotsDao.getAvailableSlots(book.getBookedDate());
	    	
	    	avSlots.setAvailableSlots(avSlots.getTotalSlots()-avSlots.getAvailableSlots());
	    	
	    	availableSlotsDao.createOrUpdateSlot(avSlots);
	    	
	        return book;
	    }
	
}
