package com.skylark.services;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 08-sept-2021
 * @copyright Skylark Airline
 * @description Service Interface for Route in business layer
 */
import java.util.List;

import com.skylark.entities.Route;
import com.skylark.exceptions.RouteNotFoundException;

public interface RouteService {
	
	Route findRouteById(String id) throws RouteNotFoundException;
	Route findByFromCity(String fromCity) throws RouteNotFoundException;
	Route findByToCity(String toCity) throws RouteNotFoundException;
	List<Route> findAll(); 
	void addRoute(Route route); 
	void editRoute(Route route); 
	void removeRoute(String route);
	

}
