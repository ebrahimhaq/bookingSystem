package com.ebbi.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_availability")
public class AvailableSlots {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "calendar_date")
	private String calendarDate;
	
	@Column(name = "total_slots")
	private int totalSlots;
	
	@Column(name = "available_slots")
	private int availableSlots;

	

	
	@Override
	public String toString() {
		return "AvailableSlots [id=" + id + ", calendarDate=" + calendarDate + ", totalSlots=" + totalSlots
				+ ", availableSlots=" + availableSlots + "]";
	}




	public AvailableSlots(long id, String calendarDate, int totalSlots, int availableSlots) {
		super();
		this.id = id;
		this.calendarDate = calendarDate;
		this.totalSlots = totalSlots;
		this.availableSlots = availableSlots;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getCalendarDate() {
		return calendarDate;
	}




	public void setCalendarDate(String calendarDate) {
		this.calendarDate = calendarDate;
	}




	public int getTotalSlots() {
		return totalSlots;
	}




	public void setTotalSlots(int totalSlots) {
		this.totalSlots = totalSlots;
	}




	public int getAvailableSlots() {
		return availableSlots;
	}




	public void setAvailableSlots(int availableSlots) {
		this.availableSlots = availableSlots;
	}




	public AvailableSlots() {}

	

}
