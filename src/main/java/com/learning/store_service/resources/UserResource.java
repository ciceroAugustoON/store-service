package com.learning.store_service.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.store_service.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> getUsers() {
		User u = new User(1L, "João", "99999999", "joao@gmail.com", "123456789");
		
		return ResponseEntity.ok().body(u);
	}
}
