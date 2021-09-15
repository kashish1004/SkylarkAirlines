package com.skylark.exceptions;

public class AirportAlreadyExistsException extends Exception {
	private String message;

	public AirportAlreadyExistsException(String message) {
		super(message);
	}
}
