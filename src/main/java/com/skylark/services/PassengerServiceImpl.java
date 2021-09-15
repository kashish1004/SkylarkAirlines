package com.skylark.services;
/*
 * @author mansi.jain@stltech.in
 * @version 1.0
 * @creation_date 09-sept-2021
 * @copyright Skylark Airline
 * @description Service Interface Implementer for Passenger in business layer
 */
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skylark.entities.Passenger;
import com.skylark.exceptions.PassengerNotFoundException;
import com.skylark.repositories.PassengerRepository;
@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepo;

	@Override
	public Passenger findPassengerById(String psId) throws PassengerNotFoundException {
		// TODO Auto-generated method stub
		return passengerRepo.findById(psId).orElseThrow(()-> new PassengerNotFoundException("Sorry! passenger is not found"));
	}
	
	@Override
	public Passenger findPassengerByFirstName(String firstName) throws PassengerNotFoundException {
		// TODO Auto-generated method stub
		return passengerRepo.findByFirstName(firstName).orElseThrow(()-> new PassengerNotFoundException("Sorry! passenger is not found"));
	}
	

	@Override
	public Passenger findPassengerByLastName(String lastName) throws PassengerNotFoundException {
		// TODO Auto-generated method stub
		return passengerRepo.findByLastName(lastName).orElseThrow(()-> new PassengerNotFoundException("Sorry! passenger is not found"));
	}
	
	@Override
	public Passenger findPassengerByBookingId(String bookingId) throws PassengerNotFoundException {
		// TODO Auto-generated method stub
		return passengerRepo.findByBookingId(bookingId).orElseThrow(()-> new PassengerNotFoundException("Sorry! passenger is not found"));
	}

	@Override
	public Passenger findPassengerByPNR(String pnr) throws PassengerNotFoundException {
		// TODO Auto-generated method stub
		return passengerRepo.findByPNR(pnr).orElseThrow(()-> new PassengerNotFoundException("Sorry! passenger is not found"));
	}
	

	@Override
	public Passenger findPassengerByPhoneNumber(int phoneNumber) throws PassengerNotFoundException {
		// TODO Auto-generated method stub
		return passengerRepo.findByPhoneNumber(phoneNumber).orElseThrow(()-> new PassengerNotFoundException("Sorry! passenger is not found"));
	}


	@Override
	public List<Passenger> findAll() {
		// TODO Auto-generated method stub
		return passengerRepo.findAll();
	}

	@Override
	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		passengerRepo.save(passenger);
		
	}

	@Override
	public void editPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		Optional<Passenger> op = passengerRepo.findById(passenger.getPsId());
		if(op.isPresent()) {
			passengerRepo.save(passenger);
		}
		else {
			System.out.println("Sorry! passenger is not found");
		}
		
	}

	@Override
	public void removePassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		Optional<Passenger> op = passengerRepo.findById(passenger.getPsId());
		if(op.isPresent()) {
			passengerRepo.delete(passenger);
		}
		else {
			System.out.println("Sorry! passenger is not found");
		}
		
		
	}

	

	

}
