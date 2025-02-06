package com.cinesage.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.cinesage.model.Ticket;

@Repository
public interface TicketRepository extends CouchbaseRepository<Ticket, String> {

}
