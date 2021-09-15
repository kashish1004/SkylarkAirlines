package com.skylark.exceptions;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 09-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description Exception for Admin Not found
 */

public class AdminNotFoundException extends Exception {
	private String message;

	public AdminNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "AdminNotFoundException [message=" + message + "]";
	}
}
