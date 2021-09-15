package com.skylark.services;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 09-sep-2021
 *  @copyright Skylark Airlines
 * @description Service Interface implementer for Admin in business layer
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skylark.entities.Admin;
import com.skylark.exceptions.AdminNotFoundException;
import com.skylark.repositories.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepo;
	
	@Override
	public Admin findByAdminName(String username) throws AdminNotFoundException {
		// TODO Auto-generated method stub
		return adminRepo.findById(username).orElseThrow(()->new AdminNotFoundException("User not found !"));
	}

}
