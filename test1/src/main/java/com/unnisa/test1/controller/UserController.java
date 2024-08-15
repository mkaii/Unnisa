package com.unnisa.test1.controller;


import com.unnisa.test1.model.User;
import com.unnisa.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("user")
    String addUser(@RequestBody User myUser)
    {
        userService.addUser(myUser);
        return "user added";
    }

    @GetMapping("users")
    List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }


    @GetMapping("users/id/{id}")
    User getUserById(@PathVariable  Integer id)
    {
        return userService.getUserById(id);
    }



}
