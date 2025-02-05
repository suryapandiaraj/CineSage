package com.enterprise.cinesage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enterprise.cinesage.Model.Ticket;
import com.enterprise.cinesage.Model.User;
import com.enterprise.cinesage.Service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // check
    @GetMapping("/")
    public String home() {
        return new String("Hello, World!");
    }

    // register user
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // get all registered users
    @GetMapping("/getUsers")
    public List<User> getUsers() throws Exception {
        return userService.getUsers();
    }

    // get user by userId
    @GetMapping("/getUser/{userId}")
    public User getUser(@PathVariable String userId) throws Exception {
        return userService.getUser(userId);
    }

    // get all tickets booked by user
    @GetMapping("/getTickets/{userId}")
    public List<Ticket> getTickets(@PathVariable String userId) throws Exception {
        return userService.getTickets(userId);
    }

}
