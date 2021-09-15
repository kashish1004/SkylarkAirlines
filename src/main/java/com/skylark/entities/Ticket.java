/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

@Entity
public class Ticket {
	
	@Id
	private String PNR;
	
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn
	private Flight flight;//redundancy
	
	@OneToMany(mappedBy = "PNR")
	@NotNull
	private List<Passenger> passenger;
	
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn
	private Booking booking;
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Ticket(String pNR, Flight flight, List<Passenger> passenger, Booking booking) {
		super();
		PNR = pNR;
		this.flight = flight;
		this.passenger = passenger;
		this.booking = booking;
	}

	public String getPNR() {
		return PNR;
	}

	public void setPNR(String pNR) {
		PNR = pNR;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	@Override
	public String toString() {
		return "Ticket [PNR=" + PNR + ", flight=" + flight + ", passenger=" + passenger + ", booking=" + booking + "]";
	}
	
}
