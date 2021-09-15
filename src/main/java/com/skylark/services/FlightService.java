/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.skylark.entities.Flight;
import com.skylark.exceptions.FlightNotFoundException;

public interface FlightService {
	void addFlight(Flight f);
	void delFlight(int id) throws FlightNotFoundException;
	void editFlight(Flight f) throws FlightNotFoundException;
	LocalTime duration(LocalTime departureTime, LocalTime arrivalTime);
	List<Flight> findFlightByRouteId(int id);
	List<Flight> findByDeptDate(LocalDate date) throws FlightNotFoundException;
	List<Flight> findByArrDate(LocalDate date) throws FlightNotFoundException;
	List<Flight> findByDeptTime(LocalTime time) throws FlightNotFoundException;
	List<Flight> findByArrTime(LocalTime time) throws FlightNotFoundException;
}
