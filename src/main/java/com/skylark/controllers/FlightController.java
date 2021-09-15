/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.controllers;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Flight;
import com.skylark.exceptions.FlightNotFoundException;
import com.skylark.services.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	private FlightService fliService;
	
	@PutMapping("/add")
	public String insertFlight(@RequestBody Flight f) {
		fliService.addFlight(f);
		return "Flight Added Successfully";
	}
	
	@DeleteMapping("/delete")
	public String deleteFlight(@RequestParam("id") int id) {
		try {
			fliService.delFlight(id);
			return "Flight deleted Successfully";
		} catch (FlightNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Flight Not Found";
	}
	
	@PostMapping("/edit")
	public String updateFlight(@RequestBody Flight f) {
		try {
			fliService.editFlight(f);
			return "Flight updated Successfully";
		} catch (FlightNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Flight Not Found";
	}
	
	@PostMapping("/depDate")
	public List<Flight> getByDepartureDate(@RequestParam("DepDate") LocalDate date) {
		try {
			return fliService.findByDeptDate(date);
			
		} catch (FlightNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/arrDate")
	public List<Flight> getByArrivalDate(@RequestParam("ArrDate") LocalDate date) {
		try {
			return fliService.findByArrDate(date);
			
		} catch (FlightNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@PostMapping("/depTime")
	public List<Flight> getByDepartureTime(@RequestParam("DepTime") LocalTime time) {
		try {
			return fliService.findByDeptTime(time);
			
		} catch (FlightNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/arrTime")
	public List<Flight> getByArrivalTime(@RequestParam("ArrTime") LocalTime time) {
		try {
			return fliService.findByArrTime(time);
			
		} catch (FlightNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
