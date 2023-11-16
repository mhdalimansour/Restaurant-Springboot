package com.restaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.restaurant.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>, RestaurantCustomRepository {

}
