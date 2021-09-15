/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 10-sept-2021
 * @copyright Skylark Airlines
 */

package com.skylark.exceptions;

public class AirportNotFoundException extends Exception {
	private String message;

	public AirportNotFoundException(String message) {
		super(message);
	}
}
