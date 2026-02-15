package com.learning.store_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.store_service.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
