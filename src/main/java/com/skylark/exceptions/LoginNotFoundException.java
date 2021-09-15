package com.skylark.exceptions;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 09-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description Exception for Login Not found
 */

public class LoginNotFoundException extends Exception {

	private String message;

	public LoginNotFoundException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "LoginNotFoundException [message=" + message + "]";
	}
}
