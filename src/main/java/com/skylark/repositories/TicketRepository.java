package com.skylark.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skylark.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, String> {

}
