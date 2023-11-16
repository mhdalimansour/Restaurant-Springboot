package com.restaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.restaurant.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
