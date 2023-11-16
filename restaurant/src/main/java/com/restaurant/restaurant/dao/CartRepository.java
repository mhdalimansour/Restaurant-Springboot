package com.restaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.restaurant.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}