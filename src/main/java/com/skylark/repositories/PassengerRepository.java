package com.skylark.repositories;
import java.util.Optional;

/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airline
 * @description DAO Interface for Passenger
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,String> {

	Optional<Passenger> findByFirstName(String firstName);

	Optional<Passenger> findByLastName(String lastName);

	Optional<Passenger> findByBookingId(String bookingId);

	Optional<Passenger> findByPNR(String pnr);

	Optional<Passenger> findByPhoneNumber(int phoneNumber);


}
