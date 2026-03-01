package com.learning.store_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.store_service.entities.User;
import com.learning.store_service.repositories.UserRepository;
import com.learning.store_service.services.exceptions.DatabaseException;
import com.learning.store_service.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (RuntimeException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User updated) {
		User user = repository.getReferenceById(id);
		updateData(user, updated);
		return user;
	}

	private void updateData(User user, User updated) {
		user.setEmail(updated.getEmail());
		user.setPhone(updated.getPhone());
		user.setName(updated.getName());
	}
}
