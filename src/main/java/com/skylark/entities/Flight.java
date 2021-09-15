/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(generator = "increment")
	private int flightId;
	
	@ManyToOne
	@NotNull 
	@JoinColumn
	private Route route;
	
	@OneToMany(mappedBy = "flight")
	@NotNull
	private List<Booking> booking;
	
	@NotNull
	private LocalTime departureTime;
	@NotNull
	private LocalDate departureDate;
	@NotNull
	private LocalTime arrivalTime;
	@NotNull
	private LocalDate arrivalDate;
	@NotNull
	private int availableSeats;
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(int flightId, Route route, LocalTime departureTime, LocalDate departureDate, LocalTime arrivalTime,
			LocalDate arrivalDate, int availableSeats) {
		super();
		this.flightId = flightId;
		this.route = route;
		this.departureTime = departureTime;
		this.departureDate = departureDate;
		this.arrivalTime = arrivalTime;
		this.arrivalDate = arrivalDate;
		this.availableSeats = availableSeats;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", route=" + route + ", departureTime=" + departureTime
				+ ", departureDate=" + departureDate + ", arrivalTime=" + arrivalTime + ", arrivalDate=" + arrivalDate
				+ ", availableSeats=" + availableSeats + "]";
	}
	
	
	
}