package com.cinesage.service;

import java.util.List;
import java.util.Optional;
import java.util.Comparator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cinesage.model.Ticket;
import com.cinesage.model.User;
import com.cinesage.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // register user
    public String registerUser(@RequestBody User user) {
        userRepository.save(user);
        return "User registered!";
    }

    // get all users
    public List<User> getUsers() throws Exception {
        List<User> usersList = userRepository.findAll();
        usersList.sort(Comparator.comparing(User::getUserId));
        if (usersList.size() > 0) {
            throw new Exception("No user found!");
        }
        return usersList;
    }

    // get user by userId
    public User getUser(String userId) throws Exception {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new Exception("User not found!");
        }
    }

    // get tickets booked by a user
    public List<Ticket> getTickets(String userId) throws Exception {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            if (user.get().getTicketsList().size() > 0) {
                List<Ticket> ticketsList = user.get().getTicketsList();
                ticketsList.sort(Comparator.comparing(Ticket::getBookingDate));
                return ticketsList;
            } else {
                throw new Exception("No tickets booked!");
            }
        } else {
            throw new Exception("User not found!");
        }
    }

}
