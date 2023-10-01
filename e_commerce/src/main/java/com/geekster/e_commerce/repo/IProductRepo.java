package com.geekster.e_commerce.repo;

import com.geekster.e_commerce.model.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {


    @Modifying
    @Query(value = "Select * from product where p_category= :category", nativeQuery = true)
    List<Product> getProductByCategory(String category);
}
