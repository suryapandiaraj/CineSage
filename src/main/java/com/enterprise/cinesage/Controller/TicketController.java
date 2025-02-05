package com.enterprise.cinesage.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.cinesage.Model.Ticket;
import com.enterprise.cinesage.Service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private TicketService ticketService;

    // get ticket details by ticketId
    @GetMapping("/getTicket/{ticketId}")
    public Ticket getTicket(@PathVariable String ticketId) throws Exception {
        return ticketService.getTicket(ticketId);
    }

}
