package com.bhargava.fullstackbackend.repository;

import com.bhargava.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
