package com.skylark.services;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 08-sept-2021
 * @copyright Skylark Airline
 * @description Service Interface Implementer for Route in business layer
 */
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skylark.entities.Route;
import com.skylark.exceptions.RouteNotFoundException;
import com.skylark.repositories.RouteRepository;
@Service
public class RouteServiceImpl implements RouteService {
	
	@Autowired
	private RouteRepository routeRepo;

	@Override
	public Route findRouteById(String id) throws RouteNotFoundException {
		// TODO Auto-generated method stub
		return routeRepo.findById(id).orElseThrow(()-> new RouteNotFoundException("Sorry! route is not found"));
	}
	
	@Override
	public Route findByFromCity(String fromCity) throws RouteNotFoundException {
		// TODO Auto-generated method stub
		return routeRepo.findByFromCity(fromCity).orElseThrow(()-> new RouteNotFoundException("Sorry! route is not found"));
	}


	@Override
	public Route findByToCity(String toCity) throws RouteNotFoundException {
		// TODO Auto-generated method stub
		return routeRepo.findByToCity(toCity).orElseThrow(()-> new RouteNotFoundException("Sorry! route is not found"));
	}
	
	@Override
	public List<Route> findAll() {
		// TODO Auto-generated method stub
		return routeRepo.findAll();
	}

	@Override
	public void addRoute(Route route) {
		// TODO Auto-generated method stub
		route.setRouteId(route.getFromCity()+route.getToCity());
		routeRepo.save(route);

	}

	@Override
	public void editRoute(Route route) {
		// TODO Auto-generated method stub
		Optional<Route> op = routeRepo.findById(route.getRouteId());
		if(op.isPresent()) {
			routeRepo.save(route);
		}
		else {
			System.out.println("Sorry! route is not found");
		}

	}

	@Override
	public void removeRoute(String route) {
		// TODO Auto-generated method stub
		Optional<Route> op = routeRepo.findById(route);
		if(op.isPresent()) {
			routeRepo.delete(op.get());
		}
		else {
			System.out.println("Sorry! route is not found");
		}

	}

	


	


}
