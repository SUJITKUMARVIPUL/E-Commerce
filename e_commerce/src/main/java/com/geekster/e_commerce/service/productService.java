package com.geekster.e_commerce.service;

import com.geekster.e_commerce.model.Product;
import com.geekster.e_commerce.repo.IProductRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {
    @Autowired
    IProductRepo productRepo;

    @Transactional
    public String addProduct(List<Product> newProduct){
        productRepo.saveAll(newProduct);
        return "Product added";
    }

    public String deleteProductByID(Integer id){
        productRepo.deleteById(id);
        return "Product deleted";
    }

    public List<Product> getProducts(){
        return (List<Product>) productRepo.findAll();
    }

    public List<Product> getProductByCategory(String category){
        return productRepo.getProductByCategory(category);
    }
}
