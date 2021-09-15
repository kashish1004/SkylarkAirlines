package com.skylark.repositories;

/*
 * @author abhay.gadhvi@stltech.in
 * @version 1.0
 * @creation_date 11-sept-2021
 * @copyright Skylark Airlines
 */

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

	List<Booking> findByBookingId(int id);

	List<Booking> findByBookingJourneyDate(LocalDate date);

	

}
