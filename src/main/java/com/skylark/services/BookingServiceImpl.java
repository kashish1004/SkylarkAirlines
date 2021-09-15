package com.skylark.services;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 11-sep-2021
 * @copyright Skylark Airlines
 * @description Service Interface implementer for Booking in business layer
 */

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skylark.entities.Booking;
import com.skylark.entities.Flight;
import com.skylark.entities.Passenger;
import com.skylark.entities.Ticket;
import com.skylark.exceptions.BookingNotFoundException;
import com.skylark.exceptions.FlightNotFoundException;
import com.skylark.repositories.BookingRepository;
import com.skylark.repositories.FlightRepository;
import com.skylark.repositories.LoginRepository;
import com.skylark.repositories.PassengerRepository;
import com.skylark.repositories.TicketRepository;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookRepo;
	
	@Autowired
	private PassengerRepository prepo;
	
	@Autowired
	private FlightRepository frepo;
	
	@Autowired
	private LoginRepository lrepo;
	
	@Autowired
	private TicketRepository trepo;

	@Override
	public void addBooking(Booking b) {
		// TODO Auto-generated method stub
		//bookRepo.save(b);

		Flight f = frepo.findById(b.getFlight().getFlightId()).get();
		System.out.println(f);
		b.setFlight(f);
		b.setBookingTotalFare(b.getFlight().getRoute().getFare() * b.getNumberOfSeats());
		bookRepo.save(b);
		Ticket t = new Ticket();
		t.setBooking(b);
		t.setFlight(f);
		System.out.println(b);
		for (Passenger p : b.getPassenger()) {
			System.out.println(p);
			t.setPNR(p.getPNR().getPNR());
			trepo.save(t);
			p.setPNR(t);
			p.setBooking(b);
			p.setLogin(lrepo.findById(p.getLogin().getEmailId()).get());
			prepo.save(p);
		}
		
	}

	@Override
	public void deleteBooking(int id) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		Optional<Booking> op=bookRepo.findById(id);
		if (op.isPresent()) {
			bookRepo.delete(op.get());
		} else {
			throw new BookingNotFoundException("there is no booking according to this id");
		}
	}

	@Override
	public void editBooking(Booking b) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		Optional<Booking> op=bookRepo.findById(b.getBookingId());
		if (op.isPresent()) {
			bookRepo.save(b);
		} else {
			throw new BookingNotFoundException("there is no booking according to this id");
		}
	}

	@Override
	public void checkStatus(Booking b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Booking> findByBookId(int id) throws BookingNotFoundException {
		// TODO Auto-generated method stub
		return bookRepo.findByBookingId(id);
	}

	@Override
	public List<Booking> findByBookJourneyDate(LocalDate date) throws FlightNotFoundException {
		// TODO Auto-generated method stub
		return bookRepo.findByBookingJourneyDate(date);
	}
	
	

}
