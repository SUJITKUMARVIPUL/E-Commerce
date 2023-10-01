package com.geekster.e_commerce.service;

import com.geekster.e_commerce.model.Order;
import com.geekster.e_commerce.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class orderService {
    @Autowired
    IOrderRepo orderRepo;

    public String addOrder(List<Order> newOrder){
        orderRepo.saveAll(newOrder);
        return "added";
    }

    public Order getOrderByID(Integer id){
        return orderRepo.findById(id).get();
    }

}
