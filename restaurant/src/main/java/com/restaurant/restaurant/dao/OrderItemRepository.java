package com.restaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.restaurant.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
