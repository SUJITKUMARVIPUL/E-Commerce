package com.geekster.e_commerce.service;

import com.geekster.e_commerce.model.User;
import com.geekster.e_commerce.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {
    @Autowired
    IUserRepo userRepo;

    public String addUser(List<User> newUser){
        userRepo.saveAll(newUser);
        return "Added";
    }

    public List<User> getAllUser(){
        return (List<User>) userRepo.findAll();
    }

    public User getUserByUserId(Integer id){
        return userRepo.findById(id).get();
    }
}
