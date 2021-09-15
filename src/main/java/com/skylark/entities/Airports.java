/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Airports {

	@Id
	private String IATACode;
	@NotNull
	private String airportName;
	@NotNull
	private String airportState;
	@NotNull
	private String airportCity;
	
	public Airports() {
		// TODO Auto-generated constructor stub
	}

	public Airports(String iATACode, String airportName, String airportState, String airportCity) {
		super();
		IATACode = iATACode;
		this.airportName = airportName;
		this.airportState = airportState;
		this.airportCity = airportCity;
	}

	public String getIATACode() {
		return IATACode;
	}

	public void setIATACode(String iATACode) {
		IATACode = iATACode;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportState() {
		return airportState;
	}

	public void setAirportState(String airportState) {
		this.airportState = airportState;
	}

	public String getAirportCity() {
		return airportCity;
	}

	public void setAirportCity(String airportCity) {
		this.airportCity = airportCity;
	}

	@Override
	public String toString() {
		return "Airports [IATACode=" + IATACode + ", airportName=" + airportName + ", airportState=" + airportState
				+ ", airportCity=" + airportCity + "]";
	}

	
	
}
