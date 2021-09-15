package com.skylark.repositories;

import java.util.Optional;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 09-sep-2021
 * @copyright Sterlite technologies Ltd.
 * @description DAO interface for Login 
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

	Optional<Login> findByPhoneNumber(long phoneNumber);
	Optional<Login> findByUsername(String username);

}
