package com.geekster.e_commerce.controller;

import com.geekster.e_commerce.model.Product;
import com.geekster.e_commerce.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class productController {
    @Autowired
    productService productService;

    @PostMapping("products")
    public String addProducts(@RequestBody List<Product> newProduct){
        return productService.addProduct(newProduct);
    }

    @GetMapping("products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("products/category/{category}")
    public List<Product> getProductByCategory(@PathVariable String category){
        return productService.getProductByCategory(category);
    }

    @DeleteMapping("products/id/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProductByID(id);
    }

}
