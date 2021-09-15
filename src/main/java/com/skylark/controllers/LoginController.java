package com.skylark.controllers;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 10-sept-2021
 * @copyright Skylark Airlines
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skylark.entities.Login;
import com.skylark.exceptions.LoginNotFoundException;
import com.skylark.services.LoginService;

@RestController
@RequestMapping("/user")
public class LoginController {

	@Autowired
	private LoginService userService;
	
	@PostMapping("/name")
	public String userValidate(@RequestBody Login user) throws LoginNotFoundException
	{ 
		
		Login l1 = userService.findByUsername(user.getUsername());
		if(l1.getPassword().equals(user.getPassword()))
		{
			
			return "user available";
		}
		else
		{
			return "user not available";
		}
	}
}
