package com.skylark.services;

import java.util.List;

import com.skylark.entities.Passenger;
import com.skylark.exceptions.PassengerNotFoundException;

/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 08-sept-2021
 * @copyright Skylark Airline
 * @description Service Interface for Passenger in business layer
 */
public interface PassengerService {
	
	Passenger findPassengerById(String psId) throws PassengerNotFoundException;
	Passenger findPassengerByFirstName(String firstName) throws PassengerNotFoundException;
	Passenger findPassengerByLastName(String lastName) throws PassengerNotFoundException;
	Passenger findPassengerByBookingId(String bookingId) throws PassengerNotFoundException;
	Passenger findPassengerByPNR(String pnr) throws PassengerNotFoundException;
	Passenger findPassengerByPhoneNumber(int phoneNumber) throws PassengerNotFoundException;
	List<Passenger> findAll();
	void addPassenger(Passenger passenger);
	void editPassenger(Passenger passenger);
	void removePassenger(Passenger passenger);

}
