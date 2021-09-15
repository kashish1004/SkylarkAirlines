package com.skylark.exceptions;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airline
 */

public class PassengerNotFoundException extends Exception {
	
	private String message;

	public PassengerNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "PassengerNotFoundException [message=" + message + "]";
	}
	

}
