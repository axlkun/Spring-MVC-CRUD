package com.example.springstorecrud.services;

import com.example.springstorecrud.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
