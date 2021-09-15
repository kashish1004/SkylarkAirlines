package com.skylark.controllers;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 11-sept-2021
 * @copyright Skylark Airline
 * @description Request Processor Web Component of Spring Web MVC
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Passenger;
import com.skylark.exceptions.PassengerNotFoundException;
import com.skylark.services.PassengerService;


@RestController
@RequestMapping("/passenger")
public class PassengerController {
	
	@Autowired
	private PassengerService passService;
	
	@PutMapping("/add")
	public String insertPassenger(@RequestBody Passenger passenger) throws PassengerNotFoundException {
		passService.addPassenger(passenger);
		return "Passenger Added Successfully";
	}
	
	@PostMapping("/edit")
	public String updatePassenger(@RequestBody Passenger passenger) throws PassengerNotFoundException {
		passService.editPassenger(passenger);
		return "Passenger updated Successfully";
	}
	
	@DeleteMapping("/delete")
	public String deletePassenger(@RequestBody Passenger passenger) throws PassengerNotFoundException {
		passService.removePassenger(passenger);
		return "Passenger deleted Successfully";
		
	}
	
	@PostMapping("/firstName")
	public Passenger getByFirstName(@RequestParam("FirstName") String firstName) {
		try {
			return (Passenger) passService.findPassengerByFirstName(firstName);

		} catch (PassengerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/lastName")
	public Passenger getByLastName(@RequestParam("LastName") String lastName) {
		try {
			return (Passenger) passService.findPassengerByLastName(lastName);

		} catch (PassengerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
