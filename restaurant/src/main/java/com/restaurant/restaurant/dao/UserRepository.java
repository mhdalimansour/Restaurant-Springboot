package com.restaurant.restaurant.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.restaurant.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  Optional<User> findByLogin(String login);
}
