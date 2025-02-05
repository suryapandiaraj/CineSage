package com.enterprise.cinesage.Repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.enterprise.cinesage.Model.Ticket;

@Repository
public interface TicketRepository extends CouchbaseRepository<Ticket, String> {

}
