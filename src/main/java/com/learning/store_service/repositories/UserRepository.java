package com.learning.store_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.store_service.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
