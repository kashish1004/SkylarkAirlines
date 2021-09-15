package com.skylark.repositories;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 09-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description DAO interface for Admin 
 */

import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Admin;

public interface AdminRepository  extends JpaRepository<Admin, String> {

}
