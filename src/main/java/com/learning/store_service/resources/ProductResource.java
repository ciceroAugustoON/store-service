package com.learning.store_service.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.store_service.entities.Product;
import com.learning.store_service.services.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductResource {
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> getProducts() {
		List<Product> Products = service.findAll();
		return ResponseEntity.ok().body(Products);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}
}
