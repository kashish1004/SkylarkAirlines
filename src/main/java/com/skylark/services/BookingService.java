package com.skylark.services;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 11-sep-2021
 *  @copyright Skylark Airlines
 * @description Service Interface  for Booking in business layer
 */
import java.time.LocalDate;
import java.util.List;

import com.skylark.entities.Booking;
import com.skylark.exceptions.BookingNotFoundException;
import com.skylark.exceptions.FlightNotFoundException;


public interface BookingService {

	void addBooking(Booking b);
	void deleteBooking(int id) throws BookingNotFoundException;
	void editBooking(Booking b) throws BookingNotFoundException;
	void checkStatus(Booking b);
	List<Booking> findByBookId(int id) throws BookingNotFoundException;
	List<Booking> findByBookJourneyDate(LocalDate date) throws FlightNotFoundException;
	
}
