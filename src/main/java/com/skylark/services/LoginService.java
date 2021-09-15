package com.skylark.services;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 09-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description Service Interface for Login in business layer
 */

import java.util.List;

import com.skylark.entities.Login;
import com.skylark.exceptions.LoginNotFoundException;

public interface LoginService {

	Login findByEmailId(String emailId) throws LoginNotFoundException;
	Login findByUsername(String username) throws LoginNotFoundException;
	Login findByPhone(long phoneNumber) throws LoginNotFoundException;
	List<Login> findAllUsers();
}
