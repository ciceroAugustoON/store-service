package com.learning.store_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.store_service.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
