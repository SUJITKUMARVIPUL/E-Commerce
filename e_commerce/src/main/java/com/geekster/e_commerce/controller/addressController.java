package com.geekster.e_commerce.controller;

import com.geekster.e_commerce.model.Address;
import com.geekster.e_commerce.service.addressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class addressController {
    @Autowired
    addressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody List<Address> newAddress){
        return addressService.addAddress(newAddress);
    }
}
