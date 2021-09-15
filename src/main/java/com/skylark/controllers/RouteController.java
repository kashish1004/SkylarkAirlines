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

import com.skylark.entities.Route;
import com.skylark.exceptions.RouteNotFoundException;
import com.skylark.services.RouteService;


@RestController
@RequestMapping("/route")
public class RouteController {
	
	@Autowired
	private RouteService roService;
	
	@PutMapping("/add")
	public String insertRoute(@RequestBody Route route) throws RouteNotFoundException {
		roService.addRoute(route);
		return "Route Added Successfully";
	}
	
	@PostMapping("/edit")
	public String updateroute(@RequestBody Route route) throws RouteNotFoundException {
		roService.editRoute(route);
		return "Route updated Successfully";
	}
	
	@DeleteMapping("/delete")
	public String deleteRoute(@RequestBody String routeId) throws RouteNotFoundException {
		roService.removeRoute(routeId);
		return "Route deleted Successfully";
		
	}
	
	@PostMapping("/fromCity")
	public Route getByFromCity(@RequestParam("FromCity") String fromCity) {
		try {
			return (Route) roService.findByFromCity(fromCity);

		} catch (RouteNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/toCity")
	public Route getByToCity(@RequestParam("FromCity") String toCity) {
		try {
			return (Route) roService.findByToCity(toCity);

		} catch (RouteNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
