package com.learning.store_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.store_service.entities.OrderItem;
import com.learning.store_service.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
