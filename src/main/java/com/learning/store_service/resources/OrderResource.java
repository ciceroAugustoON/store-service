package com.learning.store_service.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.store_service.entities.Order;
import com.learning.store_service.services.OrderService;

@RestController
@RequestMapping(value="/orders")
public class OrderResource {
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> getOrders() {
		List<Order> Orders = service.findAll();
		return ResponseEntity.ok().body(Orders);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}
}
