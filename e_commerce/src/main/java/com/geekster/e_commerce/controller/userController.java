package com.geekster.e_commerce.controller;

import com.geekster.e_commerce.model.User;
import com.geekster.e_commerce.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {
    @Autowired
    userService userService;

    @PostMapping("users")
    public String addUser(@RequestBody List<User> userList){
        return userService.addUser(userList);
    }
    @GetMapping("user/id/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserByUserId(id);
    }

}
