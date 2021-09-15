/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.exceptions;

public class FlightNotFoundException extends Exception {
	private String message;

	public FlightNotFoundException(String message) {
		super(message);
	}
}
