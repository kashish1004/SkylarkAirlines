package com.skylark.exceptions;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 11-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description Exception for Booking Not found
 */


public class BookingNotFoundException extends Exception {

	private String message;

	public BookingNotFoundException(String message) {
		super(message);
	}
}
