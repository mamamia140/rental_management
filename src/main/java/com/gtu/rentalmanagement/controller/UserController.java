package com.gtu.rentalmanagement.controller;

import com.gtu.rentalmanagement.entity.User;
import com.gtu.rentalmanagement.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static java.lang.Long.parseLong;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @RequestMapping(value="users", method = RequestMethod.GET)
    public @ResponseBody Optional<User> getUser(@RequestParam("id") String userId){
        return userService.findById(parseLong(userId));
    }
}
