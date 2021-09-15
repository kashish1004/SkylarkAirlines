/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.services;

import com.skylark.entities.Airports;
import com.skylark.exceptions.AirportAlreadyExistsException;
import com.skylark.exceptions.AirportNotFoundException;

public interface AirportService {
	Airports findByName(String name) throws AirportNotFoundException;
	Airports findByIATACode(String id) throws AirportNotFoundException;
	void addAirport(Airports a) throws AirportAlreadyExistsException;
	void editAirport(Airports a) throws AirportNotFoundException;
}
