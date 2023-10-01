package com.geekster.e_commerce.service;

import com.geekster.e_commerce.model.Address;
import com.geekster.e_commerce.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class addressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(List<Address> newAddress){
        addressRepo.saveAll(newAddress);
        return "added";
    }

}
