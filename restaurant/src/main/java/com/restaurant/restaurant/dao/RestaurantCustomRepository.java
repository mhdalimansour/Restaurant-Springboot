package com.restaurant.restaurant.dao;

import java.util.List;

import com.restaurant.restaurant.entity.Restaurant;

public interface RestaurantCustomRepository {
    List<Restaurant> findBySlug(String slug);
}
