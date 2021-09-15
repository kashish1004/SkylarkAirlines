package com.skylark.exceptions;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
<<<<<<< HEAD
 * @copyright Skylark Airline
=======
 * @copyright Sterlite technologies Ltd.
>>>>>>> eac7a5ebaae1f51c9f00baa375376d04beb60549
 */

public class RouteNotFoundException extends Exception {
	
	private String message;

	public RouteNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "RouteNotFoundException [message=" + message + "]";
	}
	
	

}
