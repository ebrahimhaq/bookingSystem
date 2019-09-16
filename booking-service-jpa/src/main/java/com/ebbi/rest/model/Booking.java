package com.ebbi.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_user_booking")
public class Booking {
	
	@Id
	private long id;
	
	@Column(name = "user_id")
	private String userID;
	
	@Column(name = "booked_date")
	private String bookedDate;
	
	@Column(name = "booking_id")
	private String bookingID;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(String bookedDate) {
		this.bookedDate = bookedDate;
	}

	public String getBookingID() {
		return bookingID;
	}

	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}

	public Booking(long id, String userID, String bookedDate, String bookingID) {
		super();
		this.id = id;
		this.userID = userID;
		this.bookedDate = bookedDate;
		this.bookingID = bookingID;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", userID=" + userID + ", bookedDate=" + bookedDate + ", bookingID=" + bookingID
				+ "]";
	}
	
	public Booking() {}
	
	

}
