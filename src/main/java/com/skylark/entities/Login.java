/*
 * @author kashish.jain@stltech.in
 * @version 1.0
 * @creation_date 07-sept-2021
 * @copyright Skylark Airlines
 */
package com.skylark.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;


@Entity
public class Login {
	@Id
	private String emailId;
	@NotNull
	private long phoneNumber;
	private String username;
	@NotNull
	private String password;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(String emailId, long phoneNumber, String username, String password) {
		super();
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.username = username;
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [emailId=" + emailId + ", phoneNumber=" + phoneNumber + ", username=" + username + ", password=" + password
				+ "]";
	}

	
	
}
