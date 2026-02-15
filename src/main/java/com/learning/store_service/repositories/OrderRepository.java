package com.learning.store_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.store_service.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
