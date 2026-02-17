package com.learning.store_service.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.store_service.entities.Category;
import com.learning.store_service.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> getCategorys() {
		List<Category> Categorys = service.findAll();
		return ResponseEntity.ok().body(Categorys);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}
}
