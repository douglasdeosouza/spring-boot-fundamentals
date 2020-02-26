package com.douglasdeosouza.fundamentals.repository;

import com.douglasdeosouza.fundamentals.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
