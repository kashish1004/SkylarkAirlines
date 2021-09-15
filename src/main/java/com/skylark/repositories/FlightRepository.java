/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.repositories;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
	List<Flight> findByRoute_RouteId(int id);
	List<Flight> findByDepartureDate(LocalDate date);
	List<Flight> findByArrivalDate(LocalDate date);
	List<Flight> findByDepartureTime(LocalTime time);
	List<Flight> findByArrivalTime(LocalTime time);
	List<Flight> OrderByArrivalTime();
	List<Flight> OrderByDepartureTime();
	List<Flight> OrderByRoute_Fare();
}
