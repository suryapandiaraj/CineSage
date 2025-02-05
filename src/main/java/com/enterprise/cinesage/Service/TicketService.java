package com.enterprise.cinesage.Service;

import org.springframework.stereotype.Service;

import com.enterprise.cinesage.Model.Ticket;
import com.enterprise.cinesage.Repository.TicketRepository;

@Service
public class TicketService {

    private TicketRepository ticketRepository;

    // get ticket by ticketId
    public Ticket getTicket(String ticketId) throws Exception {
        try {
            return ticketRepository.findById(ticketId).get();
        } catch (Exception e) {
            throw new Exception("Ticket not found!");
        }
    }

}
