/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

@Entity
public class Route {
	@Id
	@Column(name = "from_to")
	private String routeId;
	
	@OneToMany(mappedBy = "route")
	@NotNull
	private List<Flight> flight;
	@NotNull
	private String fromCity;
	@NotNull
	private String toCity;
	@NotNull
	private float fare;
	
	public Route() {
		// TODO Auto-generated constructor stub
	}

	public Route(String routeId, String fromCity, String toCity, float fare) {
		super();
		this.routeId = routeId;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.fare = fare;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public float getFare() {
		return fare;
	}

	public void setFare(float fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", fromCity=" + fromCity + ", toCity=" + toCity + ", fare=" + fare + "]";
	}
	
	
}
