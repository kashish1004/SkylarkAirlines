/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

@Entity
public class Passenger {
	@Id
	private String psId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn
	private Ticket PNR;
	
	@ManyToOne
	@NotNull
	@JoinColumn
	private Booking bookingId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@NotNull
	@JoinColumn
	private Login login;
	@NotNull
	private String firstName;
	@NotNull
	private String lastName;
	@NotNull
	private String gender;
	@NotNull
	private int phoneNumber;
	
	public Passenger() {
		// TODO Auto-generated constructor stub
	}

	public Passenger(String psId, Ticket PNR, Booking bookingId, Login login, String firstName, String lastName,
			 String gender, int phoneNumber) {
		super();
		this.psId = psId;
		this.PNR = PNR;
		this.bookingId = bookingId;
		this.login = login;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public String getPsId() {
		return psId;
	}

	public void setPsId(String psId) {
		this.psId = psId;
	}

	public Ticket getPNR() {
		return PNR;
	}

	public void setPNR(Ticket PNR) {
		this.PNR = PNR;
	}

	public Booking getBookingId() {
		return bookingId;
	}

	public void setBooking(Booking bookingId) {
		this.bookingId = bookingId;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Passenger [psId=" + psId + ", ticket=" + PNR + ", booking=" + bookingId + ", login=" + login
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
}
