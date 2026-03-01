package com.learning.store_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.learning.store_service.entities.User;
import com.learning.store_service.repositories.UserRepository;
import com.learning.store_service.services.exceptions.DatabaseException;
import com.learning.store_service.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

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
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User updated) {
		try {
			User user = repository.getReferenceById(id);
			updateData(user, updated);
			return user;
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User user, User updated) {
		user.setEmail(updated.getEmail());
		user.setPhone(updated.getPhone());
		user.setName(updated.getName());
	}
}
