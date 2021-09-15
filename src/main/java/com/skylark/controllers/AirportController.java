/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 10-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Airports;
import com.skylark.exceptions.AirportAlreadyExistsException;
import com.skylark.exceptions.AirportNotFoundException;
import com.skylark.services.AirportService;

@RestController
@RequestMapping("/airport")
public class AirportController {
	
	@Autowired
	private AirportService airService;
	
	@PutMapping("/add")
	public String addAirport(@RequestParam("i") String i, @RequestParam("n") String n,@RequestParam("s") String s, @RequestParam("c") String c) {
		try {
			Airports a = new Airports();
			a.setIATACode(i);
			a.setAirportName(n);
			a.setAirportCity(c);
			a.setAirportState(s);
			airService.addAirport(a);
			return "Airport added Successfully";
		} catch (AirportAlreadyExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Airport already exists";
	}
	
	@PostMapping("/edit")
	public String updateAirport(@RequestParam("i") String i, @RequestParam("n") String n,@RequestParam("s") String s, @RequestParam("c") String c) {
		try {
			Airports a = airService.findByIATACode(i);
			a.setAirportCity(c);
			a.setAirportName(n);
			a.setAirportState(s);
			airService.editAirport(a);
			return "Aiport updated Successfully";
		}catch (AirportNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Airport Not Found";
	}
	
	@GetMapping("/name/{nm}")
	public Airports getByName(@PathVariable("nm") String name) {
		try {
			return airService.findByName(name);
		} catch (AirportNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("/code/{code}")
	public Airports getByCode(@PathVariable("code") String code) {
		try {
			return airService.findByIATACode(code);
		} catch (AirportNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
