package com.restaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.restaurant.entity.Reviews;

public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {
}