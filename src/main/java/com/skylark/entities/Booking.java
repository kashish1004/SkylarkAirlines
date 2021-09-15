/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

@Entity
public class Booking {

	@Id
	@GeneratedValue(generator = "increment")
	private int bookingId;

	@ManyToOne
	@NotNull
	@JoinColumn
	private Flight flight;
	
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn
	private Payment payment;
	
	@OneToMany(mappedBy = "bookingId")
	@NotNull
	private List<Passenger> passenger;
	
	@NotNull
	private LocalDate bookingDate;
	@NotNull
	private float bookingTotalFare;
	@NotNull
	private LocalDate bookingJourneyDate;
	@NotNull
	private String bookingSeatType;
	@NotNull
	private String bookingStatus;
	@NotNull
	private int numberOfSeats;
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(int bookingId, Flight flight, Payment payment, List<Passenger> passenger, LocalDate bookingDate,
			float bookingTotalFare, LocalDate bookingJourneyDate, String bookingSeatType, String bookingStatus,
			int numberOfSeats) {
		super();
		this.bookingId = bookingId;
		this.flight = flight;
		this.payment = payment;
		this.passenger = passenger;
		this.bookingDate = bookingDate;
		this.bookingTotalFare = bookingTotalFare;
		this.bookingJourneyDate = bookingJourneyDate;
		this.bookingSeatType = bookingSeatType;
		this.bookingStatus = bookingStatus;
		this.numberOfSeats = numberOfSeats;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public float getBookingTotalFare() {
		return bookingTotalFare;
	}

	public void setBookingTotalFare(float bookingTotalFare) {
		this.bookingTotalFare = bookingTotalFare;
	}

	public LocalDate getBookingJourneyDate() {
		return bookingJourneyDate;
	}

	public void setBookingJourneyDate(LocalDate bookingJourneyDate) {
		this.bookingJourneyDate = bookingJourneyDate;
	}

	public String getBookingSeatType() {
		return bookingSeatType;
	}

	public void setBookingSeatType(String bookingSeatType) {
		this.bookingSeatType = bookingSeatType;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", flight=" + flight + ", payment=" + payment + ", passenger="
				+ passenger + ", bookingDate=" + bookingDate + ", bookingTotalFare=" + bookingTotalFare
				+ ", bookingJourneyDate=" + bookingJourneyDate + ", bookingSeatType=" + bookingSeatType
				+ ", bookingStatus=" + bookingStatus + ", numberOfSeats=" + numberOfSeats + "]";
	}
	
	
	
}
