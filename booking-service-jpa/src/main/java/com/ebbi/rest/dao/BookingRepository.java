package com.ebbi.rest.dao;

import org.springframework.data.repository.CrudRepository;

import com.ebbi.rest.model.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

}
